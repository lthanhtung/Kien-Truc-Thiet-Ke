package Creational_patterns.A4;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;

    int VoteTrum = 0 ;
    int VoteBiden = 0;

    List<String> users = new ArrayList<>();
    public Election() {

    }

    public static Election getInstance()
    {
        if (instance == null)
        {
            instance = new Election();
        }
        return instance;
    }

    public void vote(Candidate candidate, String Userid)
    {
        for (String id: users)
            if (id.equals(Userid))
                return;



        if (candidate == Candidate.DONAL_TRUMP)
        {
            VoteTrum++;
            users.add(Userid);
        }
        else
        if (candidate == Candidate.JOE_BIDEN)
        {
            VoteBiden++;
            users.add(Userid);

        }
    }

    public void kq()
    {
        System.out.println("Donal Trump:" + VoteTrum);
        System.out.println("Job Biden:" + VoteBiden);

    }

}
