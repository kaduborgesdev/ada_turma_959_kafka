package ada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/album")
@Controller
public class AlbumController {

    private Integer contador = 0;

    @Autowired
    AlbumProdutor albumProdutor;

    @ResponseBody
    @GetMapping("/criar")
    public String criaAlbum() {
        albumProdutor.send("ALBUM CRIADO - " + contador++);
        return "";
    }
}
