package Test.HomeTheater;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Amplifier amp = null;
		Tuner tuner = null;
		DavPlayer dvd = null;
		CdPlayer cd = null;
		Projector projector = null;
		TheaterLights lights = null;
		Screen screen = null;
		PopcornPopper popper = null;
		// TODO Auto-generated method stub
		HomeTheaterFacade homeTheater=new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
		homeTheater.watchMovie("movie name");
		homeTheater.endMovie();
	}

}
