class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return ""; // Check for empty array

        String prefix = strs[0]; // Initialize prefix with the first string

        for (int i = 1; i < strs.length; i++) { // Start from the second string
            while (strs[i].indexOf(prefix) != 0) { // While prefix not found at the start of strs[i]
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix by one character
                if (prefix.isEmpty()) return ""; // If prefix is empty, no common prefix exists
            }
        }
        return prefix; // Return the longest common prefix
    }
}