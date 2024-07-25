package props;

public enum MessageType {
    REQUEST_BUILDINGS("REQUEST_BUILDINGS"),
    RESPONSE_BUILDINGS("RESPONSE_BUILDINGS"),
    MAKE_RESERVATION("MAKE_RESERVATION"),
    ALREADY_BOOKED("ALREADY_BOOKED"),
    ROOM_NOT_FOUND("ROOM_NOT_FOUND"),
    RESERVATION_NUMBER("RESERVATION_NUMBER"),
    BUILDING_NOT_FOUND("BUILDING_NOT_FOUND"),
    ROOM_NOT_BOOKED("ROOM_NOT_BOOKED"),
    RESERVATION_CANCELLED("RESERVATION_CANCELLED"),
    RESERVATION_CONFIRMED("RESERVATION_CONFIRMED"),
    RESERVATION_CANT_FOUND("RESERVATION_CANT_FOUND"),
    CONFIRM_RESERVATION("CONFIRM_RESERVATION"),
    REGISTER_BUILDING("REGISTER_BUILDING"),
    CREATE_BUILDING("CREATE_BUILDING"),
    BUILDING_CREATED("BUILDING_CREATED"),
    CANCEL_RESERVATION("CANCEL_RESERVATION");

    private final String value;

    MessageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}



