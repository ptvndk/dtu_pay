package utils;

public class EventTypes {

    // Account Management Events
    public static final String REGISTER_ACCOUNT_REQUEST = "RegisterAccountRequest";
    public static final String REGISTER_ACCOUNT_COMPLETED = "RegisterAccountRequestCompleted";
    public static final String REGISTER_ACCOUNT_FAILED = "RegisterAccountRequestFailed";

    public static final String UNREGISTER_ACCOUNT_REQUEST = "UnregisterAccountRequest";
    public static final String UNREGISTER_ACCOUNT_SUCCESS = "UnregisterAccountRequestSuccess";
    public static final String UNREGISTER_ACCOUNT_NOT_EXIST = "UnregisterAccountRequestNotExist";
    public static final String UNREGISTER_ACCOUNT_FAILED = "UnregisterAccountRequestFailed";

    // Payment Service Events
    public static final String PAYMENT_REQUEST = "MerchantPaymentRequest";
    public static final String PAYMENT_SUCCESS = "MerchantPaymentSuccess";
    public static final String PAYMENT_FAILED = "MerchantPaymentFailed";

    // Token Service Events

    // Report Service Events
}
