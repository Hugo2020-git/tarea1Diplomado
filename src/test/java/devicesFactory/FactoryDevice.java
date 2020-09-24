package devicesFactory;

public class FactoryDevice {

    public static IDevice make(String type){
        IDevice device;
        switch (type) {
            case "android":
                device = new Android();
                break;
            case "ois":
                device = (IDevice) new IOS();
                break;
            case "windowsphone":
                device = (IDevice) new WindowsPhone();
                break;
            case "browserstack":
                device= new BrowserStack();
                break;
            default:
                device = new Android();
                break;
        }
        return device;
    }
}
