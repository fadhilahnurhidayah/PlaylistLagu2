public class PlaylistLagu {

    class Song {
        String title;
        Song next;


        public Song(String title) {
            this.title = title;
            this.next = null;
        }
    }


    class Playlist {
        private Song head;


        public Playlist() {
            this.head = null;
        }


        public void addSong(String title) {
            Song newSong = new Song(title);

            if (head == null) {
                head = newSong;
            } else {
                Song current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newSong;
            }

            System.out.println("Lagu \"" + title + "\" berhasil ditambahkan.");
        }

        public void displayPlaylist() {
            if (head == null) {
                System.out.println("Playlist kosong.");
                return;
            }

            System.out.println("Daftar lagu dalam playlist:");
            Song current = head;
            while (current != null) {
                System.out.println("- " + current.title);
                current = current.next;
            }
        }
    }


    public static void main(String[] args) {
        PlaylistLagu pmDila = new PlaylistLagu();
        Playlist playlist = pmDila.new Playlist();

        playlist.addSong("Imagination");
        playlist.addSong("Overjoyed");
        playlist.addSong("My Love");

        playlist.displayPlaylist();
    }
}

