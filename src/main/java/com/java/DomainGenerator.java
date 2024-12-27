package com.java;
import java.util.*;

public class DomainGenerator {

    private static Set<String> usedNames = new HashSet<String>();

    public static String generateRandomWebsiteName() {
        String[] adjectives = {"leak", "more", "protest", "hott", "kunfu", "back", "blue", "refer", "being", "red", "bright", "echo", "nova", "stream", "pulse", "green", "orbit", "core", "spark", "aqua", "flare", "stone", "swift", "dream", "vortex", "shade", "prime", "zenith", "quest", "shimmer", "whisper", "fusion"};
        String[] nouns = {"technical", "cloud", "sites", "leaf", "portals", "treat", "portnew", "bong", "portashique", "cold", "whisper", "flame", "drift", "glow", "horizon", "fusion", "sparkle", "ember", "mystic", "cascade", "vibe", "echoes", "breeze", "crystal", "storm", "lumen", "shadow", "voyage", "sky", "earth"};
        String[] domains = {".com", ".net", ".org", ".io", ".tech", ".co", ".info"};

        Random random = new Random();
        String websiteName;
        
        do {
            String adjective = adjectives[random.nextInt(adjectives.length)];
            String noun = nouns[random.nextInt(nouns.length)];
            String domain = domains[random.nextInt(domains.length)];
            websiteName = adjective + noun + domain;
        } while (usedNames.contains(websiteName)); // Ensure no repeats
        
        usedNames.add(websiteName);
        return websiteName;
    }

    public static void main(String[] args) {
        // Example usage: Generate 5 random website names without repeats
    	System.out.println(generateRandomWebsiteName());
    }
}

