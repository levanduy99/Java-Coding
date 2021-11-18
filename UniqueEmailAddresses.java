import java.util.HashSet;

public class UniqueEmailAddresses {
    
    //solution 1
    static int numUniqueEmails1(String[] emails) {

        HashSet<String> emailSet = new HashSet<>();

        for (String email : emails) {
            email = actuallyReceiveMail(email);
            if (!emailSet.contains(email)) {
                emailSet.add(email);
            }
        }

        return emailSet.size();
    }

    static String actuallyReceiveMail(String email) {

        String localName = email.split("@")[0];
        String domainName = email.split("@")[1];
        
        //remove everything after the first plus sign
        //remove dots
        String actuallyLocalName = "";
        for (char c : localName.toCharArray()) {
            if (c == '+') {
                break;
            } else if (c != '.') {
                actuallyLocalName += c;
            }
        }

        return actuallyLocalName + "@" + domainName;
    }

    //solution 2
    static int numUniqueEmails(String[] emails) {

        HashSet<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            int splitPosition = email.indexOf("@");
            String localName = email.substring(0, splitPosition);
            String domainName = email.substring(splitPosition);

            if (localName.contains("+")) {
                int plusPosition = localName.indexOf("+");
                localName = localName.substring(0, plusPosition); 
            }

            localName = localName.replaceAll("\\.", "");
            uniqueEmails.add(localName+domainName);
        }

        return uniqueEmails.size();
    }


    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}
