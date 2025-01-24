public enum OrderStatus {
    NEW {
        @Override
        public void handle() {
            System.out.println("Processing new order.");
        }
    },
    SHIPPED {
        @Override
        public void handle() {
            System.out.println("Order shipped.");
        }
    },
    DELIVERED {
        @Override
        public void handle() {
            System.out.println("Order delivered.");
        }
    };

    public abstract void handle();
}
