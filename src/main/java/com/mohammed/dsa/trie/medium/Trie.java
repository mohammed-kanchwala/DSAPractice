package com.mohammed.dsa.trie.medium;

public class Trie {

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }

    public void insert(String word) {
        TrieNode ws = root;
        for (char c : word.toCharArray()) {
            if (ws.children[c - 'a'] == null) {
                ws.children[c - 'a'] = new TrieNode(c);
            }
            ws = ws.children[c - 'a'];
        }
        ws.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode ws = root;
        for (char c : word.toCharArray()) {
            if (ws.children[c - 'a'] == null) return false;
            ws = ws.children[c - 'a'];
        }
        return ws.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode ws = root;
        for (char c : prefix.toCharArray()) {
            if (ws.children[c - 'a'] == null) return false;
            ws = ws.children[c - 'a'];
        }
        return true;
    }

    static class TrieNode {
        char val;
        boolean isEndOfWord;
        TrieNode[] children;

        public TrieNode() {
            TrieNode node = new TrieNode();
            node.children = new TrieNode[26];
            node.isEndOfWord = false;
        }

        public TrieNode(char c) {
            super();
            this.val = c;
        }
    }
}
