class LegacyDoorLockSystem {
    private boolean locked = true;

    public void lock() {
        locked = true;
        System.out.println("Legacy door lock: locked.");
    }

    public void unlock() {
        locked = false;
        System.out.println("Legacy door lock: unlocked.");
    }

    public String doorStatus() {
        return "Legacy door is " + (locked ? "locked" : "unlocked");
    }
}