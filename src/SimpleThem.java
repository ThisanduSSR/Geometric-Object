public class SimpleThem {
    String name;
    String[] commonAttacks;

    SimpleThem(String name, String[] commonAttacks) {
        this.name = name;
        this.commonAttacks = commonAttacks;

    }
    void showInfo() {
        System.out.println("Domain:"+name);
        System.out.println("common Attacks:");
        for(String attack: commonAttacks){
            System.out.println("  -"+ attack);
        }
        System.out.println();
    }
}
public class ITInfrastructureSecurity{
    public static void main(String[] args) {
        // Create objects for each domain
        Domain userDomain = new Domain("User Domain",
                new String[]{"Phishing", "Social Engineering", "Weak Passwords"});

        Domain workstationDomain = new Domain("Workstation Domain",
                new String[]{"Malware", "Viruses", "Unauthorized Software"});

        Domain lanDomain = new Domain("LAN Domain",
                new String[]{"Sniffing", "Packet Capture", "Unauthorized Access"});

        Domain lanToWanDomain = new Domain("LAN-to-WAN Domain",
                new String[]{"DoS/DDoS Attacks", "Firewall Breach", "Network Flooding"});

        Domain wanDomain = new Domain("WAN Domain",
                new String[]{"Man-in-the-Middle", "Eavesdropping", "IP Spoofing"});

        Domain remoteAccessDomain = new Domain("Remote Access Domain",
                new String[]{"Stolen Credentials", "VPN Hijacking", "Unauthorized Login"});
        Domain[] domains = {userDomain, workstationDomain, lanDomain,
                lanToWanDomain, wanDomain, remoteAccessDomain, systemDomain};

        // Display the information
        System.out.println("=== WHERE ATTACKS HAPPEN IN IT INFRASTRUCTURE ===\n");
        for (Domain d : domains) {
            d.showInfo();
        }

        System.out.println("💡 Reminder: Attacks can come from inside or outside the network!");
        System.out.println("🔒 Protect all domains with good security policies, training, and tools.");
    }
}
