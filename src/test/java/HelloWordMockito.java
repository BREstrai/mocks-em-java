import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;

/**
 * Created by Bruno Rudinei Estrai on 19-06-2023
 */
public class HelloWordMockito {

    @Test
    void hello() {

        LeilaoDao mock = Mockito.mock(LeilaoDao.class);

        List<Leilao> todos = mock.buscarTodos();

        Assert.assertTrue(todos.isEmpty());
    }

}
