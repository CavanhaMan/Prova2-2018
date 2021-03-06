package professorangoti.com.interaocomousuario.services;

import java.util.List;

import okhttp3.ResponseBody;
import professorangoti.com.interaocomousuario.dominio.Preco;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface InterfaceDeServicos {
    @GET("precos")
    Call<List<Preco>> getPrecos();

/*
    @GET("/categorias/{id}")
    Call<Categoria> getCategoria(@Path("id") int id);

    @GET("/categorias")
    Call<List<Categoria>> getCategorias();

    @DELETE("/produtos/{id}")
    Call<ResponseBody> removeProduto(@Path("id") int id);

    @POST("/categorias")
    Call<ResponseBody> salvar(@Body Categoria categoria);

    @POST("/produtos")
    Call<ResponseBody> salvarProduto(@Body Produto produto);
*/
}

