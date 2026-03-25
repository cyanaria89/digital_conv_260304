package Thread_쇼핑몰;

public class StockManager {
    private final String productName;       // 제품명
    private int stock;                      // 재고 수량
    private boolean outOfStock = false;     // 품절여부
    private int totalOrders = 0;            // 총 주문량?

    public StockManager(String productName, int initialStock) {
        this.productName = productName;
        this.stock = initialStock;
    }

    public String getProductName() { return productName; }
    public int getStock() { return stock; }
    public boolean isOutOfStock() { return outOfStock; }
    public int getTotalOrders() { return totalOrders; }

    // 동시에 여러 스레드가 재고에 접근하지 못하도록 Lock
    public synchronized boolean order(String userId, int quantity) {
        // 이미 품절이면 즉시 반환
        if (outOfStock) { return false; }

        // 주문 수량보다 재고가 부족한 경우
        if (stock < quantity) {
            System.out.printf(" ❌ [주문 실패] %-8s | 요청 %d개 | 재고 부족 (현재 %d개)", userId, quantity, stock);
            return false;
        }

        // 실제 결제 및 재고 차감 처리 (DB 처리 시간 시뮬레이션)
        try {
            System.out.printf(" ⏳ [처리 중] %-8s | %d개 주문 결제 진행...\n", userId, quantity);
            Thread.sleep(200);          // 결제 처리 대기 (Lock 유지)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }

        stock -= quantity;
        totalOrders++;

        System.out.printf(" ✅ [주문 완료] %-8s | %d개 구매 | 잔여 재고: %d개%n", userId, quantity, stock);

        // 재고 소진 시 품절 처리 + 대기 중인 스레드 모두 깨우기
        if (stock == 0) {
            outOfStock = true;
            notifyAll();
        }

        return true;
    }

    // 품절 될 때 까지 모니터 스레드가 여기서 대기
    public synchronized void waitUntilOutOfStock() throws InterruptedException {
        while (!outOfStock) {
            wait(); // 품절 신호가 올 때 까지 Lock 반납 후 대기
        }
    }
}
