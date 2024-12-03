public class Main {
    public static void main(String[] args){
        Network network = new Network();
 
        User rizqi = network.addUser("Rizqi");
        User rasyid = network.addUser("Rasyid");
 
        rizqi.addPost("Halo, Saya Rizqi. Ini adalah postingan pertama saya");
        rasyid.addPost("Hai semua, Saya Rasyid dan saya menggunakan app ini");
 
        network.addPost(rizqi.getPosts().get(0));
        network.addPost(rasyid.getPosts().get(0));
       
        rasyid.likePost(rizqi.getPosts().get(0));
        rizqi.likePost(rasyid.getPosts().get(0));
 
        network.showAllPosts();
    }
}