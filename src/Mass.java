public class Mass extends Thread {
    private int[] mass;
    private int size;

    public int[] getMass() {
        return mass;
    }

    public Mass(int[] mass) {
        this.mass = mass;
    }

    public Mass(int size) {
        this.size = size;
    }

    public void setMass(int[] mass) {
        this.mass = mass;
    }

    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();
        if ("GENERATE".equals(currentThreadName)) {
            generateMass();
        } else if ("AVG".equals(currentThreadName)) {
            x();
        } else if ("SUM".equals(currentThreadName)) {
            y();
        }
    }

        private void generateMass () {
            mass = new int[size];
            for (int i = 0; i < size; i++) {
                mass[i] = (int) (Math.random() * 20);
            }
        }
    }
}

