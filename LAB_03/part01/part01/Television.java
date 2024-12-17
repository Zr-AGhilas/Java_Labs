// package part01;

//     public   class Television {
//         // Attributes
//         private final String manufacturer; // Brand name
//         private final int screenSize;      // Screen size in inches
//         boolean powerOn;           // Power status (true for on, false for off)
//         private boolean muteOn;            // Mute status (true for mute, false otherwise)
//         private int channel;               // Current channel
//         private int volume;                // Volume level
    
//         // Constructor to initialize the television with default settings
//         public Television(String manufacturer, int screenSize) {
//             this.manufacturer = manufacturer;
//             this.screenSize = screenSize;
//             this.powerOn = false;
//             this.muteOn = false;
//             this.volume = 20;
//             this.channel = 2;
//         }
    
//         // Method to set the channel
//         public void setChannel(int channel) {
//             this.channel = channel;
//         }
    
//         // Method to toggle power on/off
//         public void togglePowerOnOff() {
//             powerOn = !powerOn;
//         }
    
//         // Method to toggle mute on/off
//         public void toggleMuteOnOff() {
//             muteOn = !muteOn;
//             if (muteOn) volume = 0; // Mute sets volume to 0
//         }
    
//         // Method to increase the volume
//         public void increaseVolume() {
//             if (volume < 100) volume++;
//         }
    
//         // Method to decrease the volume
//         public void decreaseVolume() {
//             if (volume > 0) volume--;
//         }
    
//         // Getter methods
//         public int getChannel() {
//             return channel;
//         }
    
//         public int getVolume() {
//             return volume;
//         }
    
//         public String getManufacturer() {
//             return manufacturer;
//         }
    
//         public int getScreenSize() {
//             return screenSize;
//         }
//     }