package ua.i.mail100.launcher;

import ua.i.mail100.model.Launch;
import ua.i.mail100.model.LaunchList;
import ua.i.mail100.service.Parser;
import ua.i.mail100.service.RequestService;

import java.io.IOException;

public class LaunchRunner {
    public static void main(String[] args) throws IOException {
        String url = "https://launchlibrary.net/1.4/launch";
        String readedJson = RequestService.httpGet(url);

        Parser<LaunchList> launchParser = new Parser<>();
        LaunchList launchList = launchParser.parse(readedJson, LaunchList.class);

        for (Launch launch:launchList.getLaunches()){
            System.out.println(launch);
        }
    }
}
