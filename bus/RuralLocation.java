package bus;

class RuralLocation extends Location {
    private boolean hasTransportFacility;

    RuralLocation(String name, String address, boolean hasTransportFacility) {
        super(name, address);
        this.hasTransportFacility = hasTransportFacility;
    }

    @Override
    public String toString() {
        return super.toString() + ", Transport Facility: " + (hasTransportFacility ? "Available" : "Not Available");
    }

    protected boolean hasTransportFacility() {
        return hasTransportFacility;
    }
}