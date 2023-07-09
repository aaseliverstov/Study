public enum Gender {
    male("Мужской"),
    female("Женский");

    private final String label;

    Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
