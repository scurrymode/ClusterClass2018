package music;

abstract public class MusicPlayer { //추상클래스
	//모든 플레이어에 들어가야할 기능을 최상위 객체에 선언한다.
	
abstract public void play();

abstract public void setVolume();
	
public void stop() {
		System.out.println("정지");
						}

}
