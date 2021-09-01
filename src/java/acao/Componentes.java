/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import controlador.Logica;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.AtividadeDao;
import jdbc.CanalDao;
import jdbc.ConnectionFactory;
import jdbc.CustoDao;
import jdbc.FontesRendaDao;
import jdbc.ParceriaDao;
import jdbc.PropostaValorDao;
import jdbc.RecursosDao;
import jdbc.RelacoesDao;
import jdbc.SegmentoMercadoDao;
import modelo.Canva;

/**
 *
 * @author Vitor
 */
public class Componentes implements Logica {

    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {

        try (Connection conn = new ConnectionFactory().recuperarConexao()) {

            ParceriaDao parceria = new ParceriaDao(conn);
            List<Canva> parcerias = parceria.getParcerias();
            request.setAttribute("parcerias", parcerias);

            AtividadeDao atividade = new AtividadeDao(conn);
            List<Canva> atividades = atividade.getAtividades();
            request.setAttribute("atividades", atividades);

            CanalDao canal = new CanalDao(conn);
            List<Canva> canais = canal.getCanais();
            request.setAttribute("canais", canais);

            CustoDao custo = new CustoDao(conn);
            List<Canva> custos = custo.getCustos();
            request.setAttribute("custos", custos);

            FontesRendaDao fonte = new FontesRendaDao(conn);
            List<Canva> fontes = fonte.getFontesRenda();
            request.setAttribute("fontes", fontes);

            PropostaValorDao proposta = new PropostaValorDao(conn);
            List<Canva> propostas = proposta.getPropostaValor();
            request.setAttribute("propostas", propostas);

            RecursosDao recurso = new RecursosDao(conn);
            List<Canva> recursos = recurso.getRecursosChave();
            request.setAttribute("recursos", recursos);

            SegmentoMercadoDao segmento = new SegmentoMercadoDao(conn);
            List<Canva> segmentos = segmento.getSegmentos();
            request.setAttribute("segmentos", segmentos);

            RelacoesDao relacao = new RelacoesDao(conn);
            List<Canva> relacoes = relacao.getRelacoes();
            request.setAttribute("relacoes", relacoes);

            return "forward:canva.jsp";
        }
    }

}
