package designpatterns.bridge.os;

import designpatterns.bridge.os.bridge.OperatingSystem;

public class Pc extends Computer {
    public Pc(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startUp() {
        this.os.startup();
    }

    @Override
    public void browseInternet(String url) {
        this.os.loadUrl(url);
    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }
}
