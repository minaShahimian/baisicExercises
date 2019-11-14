package co_creation2.Reflection1;

import co_creation2.Reflection2.Postman;

public class PostOfficeApplication {
    public static void main(String[] args) {
        Letter michaeler_straße_ = new Letter("Michaeler straße ", true);
        Letter michaeler_straße_2 = new Letter("Michaeler straße2 ", false);
        Letter michaeler_straße_3 = new Letter("Michaeler straße3 ", false);
        PostOfficeAssistant postOfficeAssistant = new PostOfficeAssistant();
        postOfficeAssistant.stamp(michaeler_straße_);
        postOfficeAssistant.stamp(michaeler_straße_2);
        postOfficeAssistant.stamp(michaeler_straße_3);
        postOfficeAssistant.send(michaeler_straße_);
        postOfficeAssistant.send(michaeler_straße_2);
        postOfficeAssistant.send(michaeler_straße_3);

        Postman postman = new Postman();
        postman.deliver(michaeler_straße_);
    }
}