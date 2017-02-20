package Proxy.HotOrNot;

/**
 * Created by kami.wm on 16/02/2017.
 *
 */
public class PersonBeanImp implements PersonBean{
    String name;
    String gender;
    String interests;
    int hotOrNotRating;
    int hotOrNotRatingCount;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        return hotOrNotRating;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;

    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;

    }

    @Override
    public void setHotOrNotRating(int hotOrNotRating) {
        this.hotOrNotRating += hotOrNotRating;
        this.hotOrNotRatingCount++;

    }
}
