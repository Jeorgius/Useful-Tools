import com.google.gson.*;
import pageData.music;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("api/MusicGet")
public class AngularGet  {
    @GET

    public String musicJSON () {
        music ClipData = new music();
        ClipData.setTitle("MyClip");
        ClipData.setDescription("Cool Thing");
        ClipData.setLength("Not very Long");

        JsonElement Clip1 = new Gson().toJsonTree(ClipData);
        JsonArray JSONarray = new JsonArray();
        JSONarray.add(Clip1);
        return new GsonBuilder().setPrettyPrinting().create().toJson(JSONarray);
    }

}
