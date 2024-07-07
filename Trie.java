public class Trie {
    Trie[] children;
    boolean is;

    public Trie() {
        this.children = new Trie[26];
        this.is = false;
    }
    
    public void insert(String word) {
        Trie curr = this;
        for (int i =0; i < word.length(); ++i){
                Trie next = curr.children[word.charAt(i)- 'a'];
                if (next == null){
                    next = curr.children[word.charAt(i)- 'a'] = new Trie();
                }
                curr = next;
        }
        curr.is = true;
    }
    
    public boolean search(String word) {
        Trie curr = this;
        for (int i =0; i < word.length(); ++i){
                Trie next = curr.children[word.charAt(i)- 'a'];
                if (next == null){
                    return false;
                }
                curr = next;
        }
        return curr.is;
        
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = this;
        for (int i =0; i < prefix.length(); ++i){
                Trie next = curr.children[prefix.charAt(i)- 'a'];
                if (next == null){
                    return false;
                }
                curr = next;
        }
        return true;

    }
}
