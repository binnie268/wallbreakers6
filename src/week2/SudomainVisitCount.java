package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SudomainVisitCount {

    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {

        Map<String, Integer> domainVisitMap = new HashMap<>();
        int domainCount;
        String domainUrl;

        for(int i = 0; i < cpdomains.length; i++) {
            domainCount = Integer.valueOf(cpdomains[i].split(" ")[0]);
            domainUrl = cpdomains[i].split(" ")[1];
            findDomainCount(domainUrl, domainVisitMap, domainCount);
        }

        List<String> domainList = new ArrayList<>();

        for (Map.Entry<String, Integer> result: domainVisitMap.entrySet()) {
            domainList.add(result.getValue().toString() + " " +result.getKey().toString());
        }

        return domainList;
    }

    private static void findDomainCount(String domainUrl, Map<String, Integer> domainVisitMap, int domainCount) {
        if(domainVisitMap.get(domainUrl.split(" ")[0]) == null) {
            domainVisitMap.put(domainUrl.split(" ")[0], domainCount);
        } else {
            int count = domainVisitMap.get(domainUrl.split(" ")[0]);
            domainVisitMap.put(domainUrl.split(" ")[0], count += domainCount);
        }

        if(domainVisitMap.get(domainUrl.substring(domainUrl.indexOf(".")+1, domainUrl.length())) == null) {
            domainVisitMap.put(domainUrl.substring(domainUrl.indexOf(".")+1, domainUrl.length()), domainCount);
        } else {
            int count = domainVisitMap.get(domainUrl.substring(domainUrl.indexOf(".")+1, domainUrl.length()));
            domainVisitMap.put(domainUrl.substring(domainUrl.indexOf(".")+1, domainUrl.length()), count += domainCount);
        }

//        String[] strings = domainUrl.split("\\.");
//        System.out.println(strings);
//        System.out.println(domainUrl.split("\\.").length);

        if(domainUrl.split("\\.").length >= 3) {
            if(domainVisitMap.get(domainUrl.substring(domainUrl.lastIndexOf(".")+1, domainUrl.length())) == null) {
                System.out.println(domainUrl.substring(domainUrl.lastIndexOf(".")+1, domainUrl.length()));
                domainVisitMap.put(domainUrl.substring(domainUrl.lastIndexOf(".")+1, domainUrl.length()), domainCount);
            } else {
                int count = domainVisitMap.get(domainUrl.substring(domainUrl.lastIndexOf(".")+1, domainUrl.length()));
                domainVisitMap.put(domainUrl.substring(domainUrl.lastIndexOf(".")+1, domainUrl.length()), count += domainCount);
            }
        }
    }
}
