package core.oodesign.behavioral.observer;

interface ICelebrity {

	void follow(IFan fan);

	void unfollow(IFan fan);

	void notifyUpdate(String movies);

}
