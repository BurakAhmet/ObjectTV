public class TV {
	private int channel;
	private int volumeLevel;
	final boolean ON=true;
	TV (int channel, int volumeLevel) {
		if(channel>120)
		{
			this.channel=120;
		}
		else if(channel<1)
		{
			this.channel=1;
		}
		else
		{
			this.channel=channel;
		}
		if(volumeLevel>7)
		{
			this.volumeLevel=7;
		}
		else if (volumeLevel<1)
		{
			this.volumeLevel=1;
		}
		else
		{
			this.volumeLevel=volumeLevel;
		}
	}
	public void setChannel(int newChannel) {
		if(channel>=1 && channel<=120)
		{
			channel=newChannel;
		}
	}
	public void setVolume(int newVolume) {
		if(volumeLevel>=1 && volumeLevel<=7)
		{
			volumeLevel=newVolume;
		}
	}
	public void channelUp() {
		if(channel<120)
		{
			channel++;
		}
	}
	public void channelDown() {
		if(channel>1)
		{
			channel--;
		}
	}
	public void volumeUp() {
		if(volumeLevel<7)
		{
			volumeLevel++;
		}
	}
	public void volumeDown() {
		if(volumeLevel>1)
		{
			volumeLevel--;
		}
	}
	public int getChannel() {
		return this.channel;
	}
	public int getVolumeLevel() {
		return this.volumeLevel;
	}
}
