package Proxy.HotOrNot;

/**
 * Created by kami.wm on 16/02/2017.
 *
 */
public interface PersonBean {

    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int hotOrNotRating);
}
