package tw.com.rex.view;

import org.apereo.cas.support.oauth.util.OAuth20Utils;
import org.apereo.cas.support.oauth.web.views.OAuth20UserProfileViewRenderer;
import org.apereo.cas.ticket.accesstoken.OAuth20AccessToken;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class CustomOAuth20UserProfileViewRenderer implements OAuth20UserProfileViewRenderer {

    @Override
    public ResponseEntity<String> render(Map<String, Object> model,
                                         OAuth20AccessToken accessToken,
                                         HttpServletResponse response) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("username", "rex");
        hashMap.put("region", "TW");
        return ResponseEntity.ok(OAuth20Utils.toJson(hashMap));
    }

}
