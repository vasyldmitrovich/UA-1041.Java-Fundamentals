abstract class Bird {
    private String feathers;
    private boolean layEggs;

    public Bird() {
    }

    @Override
    public String toString() {
        return "Bird {" +
                "feathers = " + feathers +
                ", layEggs = " + layEggs +
                '}';
    }

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();
}

    class NonFlyingBird extends Bird {
        public NonFlyingBird(String feathers, boolean layEggs) {
            super(feathers, layEggs);
        }

        @Override
        void fly() {

        }
    }

    class Penguin extends NonFlyingBird {
        public Penguin(String feathers, boolean layEggs) {
            super(feathers, layEggs);
        }

        @Override
        void fly() {
            super.fly();
        }
    }

    class Kiwi extends NonFlyingBird {
        public Kiwi(String feathers, boolean layEggs) {
            super(feathers, layEggs);
        }

        @Override
        void fly() {
            super.fly();
        }
    }

    class FlyingBird extends Bird {
        public FlyingBird(String feathers, boolean layEggs) {
            super(feathers, layEggs);
        }

        @Override
        void fly() {

        }
    }

    class Eagle extends FlyingBird {
        public Eagle(String feathers, boolean layEggs) {
            super(feathers, layEggs);
        }

        @Override
        void fly() {
            super.fly();
        }
    }

    class Swallow extends FlyingBird {
        public Swallow(String feathers, boolean layEggs) {
            super(feathers, layEggs);
        }

        @Override
        void fly() {
            super.fly();
        }
    }
