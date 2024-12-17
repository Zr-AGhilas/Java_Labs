
import java.util.Scanner;

public class TestTv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Scenario 1 - User enters TV brand and screen size
        System.out.println("Television Demo\n***************");
        System.out.print("Enter the brand Name: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter the size (inch): ");
        int size = scanner.nextInt();
        
        Television tv = new Television(brand, size);
        
        // Prompt to turn on the TV
        System.out.print("Your TV is off would you like to turn it on? (Y/N): ");
        char powerChoice = scanner.next().charAt(0);
        
        if (powerChoice == 'Y' || powerChoice == 'y') {
            tv.togglePowerOnOff();
        } else {
            System.out.println("ok see you later");
            System.exit(0); // Terminates the programeeeeeeeeee
            
        }

        // Display initial state of the TV
        displayTvState(tv);

        // Scenario 1 - User sets channel and volume
        System.out.print("Enter the desired channel number: ");
        int channel = scanner.nextInt();
        tv.setChannel(channel);

        System.out.print("Enter the desired volume level: ");
        int volume = scanner.nextInt();
        tv.increaseVolumeTo(volume);
        

        // Display updated state of the TV
        displayTvState(tv);

        // Lower the volume if it’s too loud
        if (tv.getVolume() > 50) {
            System.out.println("Too loud!! I am lowering the volume.");
            tv.decreaseVolumeTo(21); // Lowering volume to 21
            displayTvState(tv);
        }

        // Scenario 2 - Mute and unmute simulation
        System.out.println("The phone is ringing!! I am muting your TV.");
        tv.toggleMuteOnOff();
        displayTvState(tv);

        System.out.println("Welcome back, I am resuming your sound level.");
        tv.toggleMuteOnOff(); // Unmute
        displayTvState(tv);

        // Turn off the TV after watching
        System.out.print("Watching time exceeded 2 hours, turn your TV off (Y/N): ");
        char offChoice = scanner.next().charAt(0);

        if (offChoice == 'Y' || offChoice == 'y') {
            tv.togglePowerOnOff();
            System.out.println("Bye!");
        }

        scanner.close();
    }

    // Method to display the state of the TV
    private static void displayTvState(Television tv) {
        System.out.println("********************************************************");
        System.out.println("manufacturer : " + tv.getManufacturer());
        System.out.println("screen Size : " + tv.getScreenSize());
        System.out.println("it is powered " + (tv.powerOn ? "on" : "off"));
        System.out.println("mute : " + (tv.muteOn ? "Yes" : "No"));
        System.out.println("channel : " + tv.getChannel());
        System.out.println("volume : " + tv.getVolume());
        System.out.println("********************************************************");
    }
    

   

 static    class Television {
    private final String manufacturer;
    private final int screenSize;
    public boolean powerOn;
    public boolean muteOn;
    private int channel;
    private int volume;

    // Constructor to initialize Television
    public Television(String manufacturer, int screenSize) {
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.powerOn = false; // TV is initially off
        this.muteOn = false;  // Mute is initially off
        this.channel = 2;     // Default channel
        this.volume = 20;     // Default volume
    }

    // Method to turn the TV on or off
    public void togglePowerOnOff() {
        powerOn = !powerOn;
    }

    // Method to toggle mute on or off
    public void toggleMuteOnOff() {
        muteOn = !muteOn;
    }

    // Set the channel
    public void setChannel(int channel) {
        if (powerOn && channel > 0) {
            this.channel = channel;
        }
    }

    // Increase the volume
    public void increaseVolume() {
        if (powerOn && volume < 100) {
            volume++;
        }
    }

    // Decrease the volume
    public void decreaseVolume() {
        if (powerOn && volume > 0) {
            volume--;
        }
    }

    // Set volume directly to a target level by increasing
    public void increaseVolumeTo(int targetVolume) {
        while (powerOn && volume < targetVolume && volume < 100) {
            increaseVolume();
        }
    }

    // Set volume directly to a target level by decreasing
    public void decreaseVolumeTo(int targetVolume) {
        while (powerOn && volume > targetVolume && volume > 0) {
            decreaseVolume();
        }
    }

    // Getters for Television attributes
    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}

}
