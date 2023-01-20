package uk.bs338.codeclan.javaAir;

public enum Rank {
    CAPTAIN,
    FIRST_OFFICER,
    PURSER,
    ATTENDANT;

    public boolean canCaptainPlane() {
        return this == CAPTAIN;
    }

    public boolean canPilotPlane() {
        return this == CAPTAIN || this == FIRST_OFFICER;
    }

    public boolean isCabinCrew() {
        switch (this) {
            case PURSER:
            case ATTENDANT:
                return true;
            default:
                return false;
        }
    }
}
