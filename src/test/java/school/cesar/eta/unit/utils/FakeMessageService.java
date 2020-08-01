package school.cesar.eta.unit.utils;

import school.cesar.eta.unit.MessageService;

public class FakeMessageService extends MessageService {
    @Override
    public boolean send(String msg, String rec) {
        return true;
    }
}
