package core.oodesign.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Shahrukh implements ICelebrity {

	private List<IFan> fans = new ArrayList<>();
	private String letestMovie;

	@Override
	public void follow(IFan fan) {
		fans.add(fan);
	}

	@Override
	public void unfollow(IFan fan) {
		fans.remove(fan);
	}

	@Override
	public void notifyUpdate(String movie) {
		for (IFan iFan : fans) {
			iFan.update(movie);
		}
	}

	public String getLetestMovie() {
		return letestMovie;
	}

	public void setLetestMovie(String letestMovie) {
		this.letestMovie = letestMovie;
		notifyUpdate(letestMovie);
	}

}
