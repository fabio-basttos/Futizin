package com.example.khristian.futizinbeta;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Khristian on 04/06/2017.
 */

public class PartidaRegistroRequest extends StringRequest {
    private static final String REQUEST_PARTIDA_REGISTRO_URL = "http://futizin.pe.hu/registroPartida.php?";
    private Map<String, String> params;

    public PartidaRegistroRequest (String nome_usuario, String senha, Response.Listener<String> listener) {
        super(Method.POST, REQUEST_PARTIDA_REGISTRO_URL, listener, null);
        params = new HashMap<>();
        params.put("Usuario", nome_usuario);
        params.put("Senha", senha);
    }

    @Override

    public Map<String, String> getParams() {
        return params;
    } 
}
