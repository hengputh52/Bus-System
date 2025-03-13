package bus;

class CityLocation extends Location {
    private boolean hasBusTerminal;

    CityLocation(String name, String address, boolean hasBusTerminal) {
        super(name, address);
        this.hasBusTerminal = hasBusTerminal;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Bus Terminal: " + (hasBusTerminal ? "Yes" : "No");
    }

    protected boolean hasBusTerminal() {
        return hasBusTerminal;
    }
}