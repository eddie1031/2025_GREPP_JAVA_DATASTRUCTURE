package io.eddie.map;

import io.eddie.Collection;

public class HashMapTest {

    public static void main(String[] args) {

        Map<Integer, Article> map = new HashMap<>();

        for ( int i = 1; i <= 10; i++ ) {
            Article article = new Article(i, "제목_" + i);
            map.put(i, article);
        }

        Collection<Article> values = map.values();

        for (Article value : values) {
            System.out.println("value = " + value);
        }


    }

    static class Article {

        private int id;
        private String title;

        public Article(int id, String title) {
            this.id = id;
            this.title = title;
        }

        @Override
        public String toString() {
            return "Article{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    '}';
        }

    }


}
