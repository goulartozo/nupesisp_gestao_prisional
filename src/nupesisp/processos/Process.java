
package nupesisp.processos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.sun.jdi.connect.spi.*;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import nupesisp.config_db.ConexaoBanco;


public class Process {

    public void adicionarPreso(
        String responsavelAtendimento,
        String dataAtendimentovar,
        boolean transferenciaUnidade,
        String procedencia,
        String nomeCompleto,
        String nomeSocial,
        String dataNascimento,
        String idade,
        String cpf,
        boolean nacionalidadeBrasileiro,
        boolean nacionalidadeNaturalizado,
        boolean nacionalidadeEstrangeiro,
        String pais,
        String nomeMae,
        boolean estadoCivilSolteiro,
        boolean estadoCivilCasado,
        boolean estadoCivilUniaoEstavel,
        boolean estadoCivilOutro,
        String estadoCivilOutroTexto,
        boolean racaBranco,
        boolean racaPreto,
        boolean racaPardo,
        boolean racaAmarelo,
        boolean racaIndigena,
        String etnia,
        boolean sexoFeminino,
        boolean sexoMasculino,
        boolean sexoIntersexual,
        boolean sexoNaoInformar,
        boolean identidadeGeneroHomem,
        boolean identidadeGeneroMulher,
        boolean identidadeGeneroHomemTrans,
        boolean identidadeGeneroMulherTrans,
        boolean identidadeGeneroNaoBinario,
        boolean identidadeGeneroNaoInformar,
        boolean orientacaoSexualHetero,
        boolean orientacaoSexualHomo,
        boolean orientacaoSexualBi,
        boolean orientacaoSexualOutra,
        String orientacaoSexualOutraTexto,
        boolean orientacaoSexualNaoInformar
    ) {
        String sql = "INSERT INTO pacientes_atendimentos (" +
                "responsavel_atendimento, data_atendimento, transferencia_unidade, procedencia, nome_completo, nome_social, data_nascimento, idade, cpf, " +
                "nacionalidade_brasileiro, nacionalidade_naturalizado, nacionalidade_estrangeiro, pais, nome_mae, " +
                "estado_civil_solteiro, estado_civil_casado, estado_civil_uniao_estavel, estado_civil_outro, estado_civil_outro_texto, " +
                "raca_branco, raca_preto, raca_pardo, raca_amarelo, raca_indigena, etnia, " +
                "sexo_feminino, sexo_masculino, sexo_intersexual, sexo_nao_informar, " +
                "identidade_genero_homem, identidade_genero_mulher, identidade_genero_homem_trans, identidade_genero_mulher_trans, identidade_genero_nao_binario, identidade_genero_nao_informar, " +
                "orientacao_sexual_hetero, orientacao_sexual_homo, orientacao_sexual_bi, orientacao_sexual_outra, orientacao_sexual_outra_texto, orientacao_sexual_nao_informar" +
                ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conexao = ConexaoBanco.abreConexao();
             PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setString(1, responsavelAtendimento);
            pst.setString(2, dataAtendimentovar);
            pst.setBoolean(3, transferenciaUnidade);
            pst.setString(4, procedencia);
            pst.setString(5, nomeCompleto);
            pst.setString(6, nomeSocial);
            pst.setString(7, dataNascimento);
            pst.setString(8, idade);
            pst.setString(9, cpf);

            pst.setBoolean(10, nacionalidadeBrasileiro);
            pst.setBoolean(11, nacionalidadeNaturalizado);
            pst.setBoolean(12, nacionalidadeEstrangeiro);
            pst.setString(13, pais);
            pst.setString(14, nomeMae);

            pst.setBoolean(15, estadoCivilSolteiro);
            pst.setBoolean(16, estadoCivilCasado);
            pst.setBoolean(17, estadoCivilUniaoEstavel);
            pst.setBoolean(18, estadoCivilOutro);
            pst.setString(19, estadoCivilOutroTexto);

            pst.setBoolean(20, racaBranco);
            pst.setBoolean(21, racaPreto);
            pst.setBoolean(22, racaPardo);
            pst.setBoolean(23, racaAmarelo);
            pst.setBoolean(24, racaIndigena);
            pst.setString(25, etnia);

            pst.setBoolean(26, sexoFeminino);
            pst.setBoolean(27, sexoMasculino);
            pst.setBoolean(28, sexoIntersexual);
            pst.setBoolean(29, sexoNaoInformar);

            pst.setBoolean(30, identidadeGeneroHomem);
            pst.setBoolean(31, identidadeGeneroMulher);
            pst.setBoolean(32, identidadeGeneroHomemTrans);
            pst.setBoolean(33, identidadeGeneroMulherTrans);
            pst.setBoolean(34, identidadeGeneroNaoBinario);
            pst.setBoolean(35, identidadeGeneroNaoInformar);

            pst.setBoolean(36, orientacaoSexualHetero);
            pst.setBoolean(37, orientacaoSexualHomo);
            pst.setBoolean(38, orientacaoSexualBi);
            pst.setBoolean(39, orientacaoSexualOutra);
            pst.setString(40, orientacaoSexualOutraTexto);
            pst.setBoolean(41, orientacaoSexualNaoInformar);

            pst.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

        public void salvarDados(
                boolean escolaridadeFundamentalInc, boolean escolaridadeFundamentalComp, boolean escolaridadeMedioInc, boolean escolaridadeMedioComp, boolean escolaridadeSuperiorInc, boolean escolaridadeSuperiorComp, boolean beneficioNao, boolean beneficioSim, String qualBeneficio, boolean possuiFilhosNao, boolean possuiFilhosSim, String quantosFilhos, boolean outrosDependentesNao, boolean outrosDependentesSim, String quantosDependentes, String idadeSocial, boolean encaminhamentoNEEJA, boolean assistSocial, boolean deficienciaNao, boolean deficienciaSim, String qualDeficiencia, boolean deficienciaNaoSabe, boolean alergiasNao, boolean alergiasSim, String quaisAlergias, boolean alergiasNaoSabe, boolean cirurgiasNao, boolean cirurgiasSim, String quaisCirurgias, boolean cirurgiasNaoSabe, boolean hipertensao, boolean diabetes, boolean hiv, boolean sifilis, boolean hpv, boolean tuberculose, String cpf) {
        String sql = "UPDATE pacientes_atendimentos SET " +
            "escolaridade_fundamental_inc = ?, escolaridade_fundamental_comp = ?, escolaridade_medio_inc = ?, escolaridade_medio_comp = ?, escolaridade_superior_inc = ?, escolaridade_superior_comp = ?, " +
            "beneficio_nao = ?, beneficio_sim = ?, qual_beneficio = ?, " +
            "possui_filhos_nao = ?, possui_filhos_sim = ?, quantos_filhos = ?, " +
            "outros_dependentes_nao = ?, outros_dependentes_sim = ?, quantos_dependentes = ?, idade_social = ?, " +
            "encaminhamento_neeja = ?, assist_social = ?, " +
            "deficiencia_nao = ?, deficiencia_sim = ?, qual_deficiencia = ?, deficiencia_nao_sabe = ?, " +
            "alergias_nao = ?, alergias_sim = ?, quais_alergias = ?, alergias_nao_sabe = ?, " +
            "cirurgias_nao = ?, cirurgias_sim = ?, quais_cirurgias = ?, cirurgias_nao_sabe = ?, " +
            "hipertensao = ?, diabetes = ?, hiv_historico = ?, sifilis_historico = ?, hpv = ?, tuberculose = ? " +
            "WHERE cpf = ?";

        try (Connection conexao = ConexaoBanco.abreConexao();
             PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setBoolean(1, escolaridadeFundamentalInc);
            pst.setBoolean(2, escolaridadeFundamentalComp);
            pst.setBoolean(3, escolaridadeMedioInc);
            pst.setBoolean(4, escolaridadeMedioComp);
            pst.setBoolean(5, escolaridadeSuperiorInc);
            pst.setBoolean(6, escolaridadeSuperiorComp);

            pst.setBoolean(7, beneficioNao);
            pst.setBoolean(8, beneficioSim);
            pst.setString(9, qualBeneficio);

            pst.setBoolean(10, possuiFilhosNao);
            pst.setBoolean(11, possuiFilhosSim);
            pst.setString(12, quantosFilhos);

            pst.setBoolean(13, outrosDependentesNao);
            pst.setBoolean(14, outrosDependentesSim);
            pst.setString(15, quantosDependentes);
            pst.setString(16, idadeSocial);

            pst.setBoolean(17, encaminhamentoNEEJA);
            pst.setBoolean(18, assistSocial);

            pst.setBoolean(19, deficienciaNao);
            pst.setBoolean(20, deficienciaSim);
            pst.setString(21, qualDeficiencia);
            pst.setBoolean(22, deficienciaNaoSabe);

            pst.setBoolean(23, alergiasNao);
            pst.setBoolean(24, alergiasSim);
            pst.setString(25, quaisAlergias);
            pst.setBoolean(26, alergiasNaoSabe);

            pst.setBoolean(27, cirurgiasNao);
            pst.setBoolean(28, cirurgiasSim);
            pst.setString(29, quaisCirurgias);
            pst.setBoolean(30, cirurgiasNaoSabe);

            pst.setBoolean(31, hipertensao);
            pst.setBoolean(32, diabetes);
            pst.setBoolean(33, hiv);
            pst.setBoolean(34, sifilis);
            pst.setBoolean(35, hpv);
            pst.setBoolean(36, tuberculose);

            pst.setString(37, cpf);

            int linhasAfetadas = pst.executeUpdate();
            System.out.println("Atualização concluída, linhas afetadas: " + linhasAfetadas);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void salvarDados2(boolean doencaPeleNao, boolean doencaPeleSim, String qualDoencaPele, boolean autoimuneNao, boolean autoimuneSim, String outraAutoimune, boolean autoimuneNaoSabe, String obsAutoimune, String obsHepatite, boolean medicamentoContinuoNao, boolean medicamentoContinuoSim, String quaisMedicamentos, boolean contatoEnchenteNao, boolean contatoEnchenteSim, String anoEnchente, String descreverExposicao, boolean tipoSanguineoAPos, boolean tipoSanguineoANeg, boolean tipoSanguineoBPos, boolean tipoSanguineoBNeg, boolean tipoSanguineoOPos, boolean tipoSanguineoONeg, boolean tipoSanguineoABPos, boolean tipoSanguineoABNeg, boolean tipoSanguineoNaoSabe, String encaminhamentoSangue, boolean gestacaoNaoSabe, boolean gestacaoNao, boolean gestacaoSim, String idadeGestacional, boolean contraceptivoNao, boolean anticoncepcionalOral, boolean diuImplante, boolean anticoncepcionalInjetavel, boolean ligaduraTrompas, boolean histerectomia, boolean preventivoNao, boolean preventivoSim, String anoPreventivo, boolean ofertarContinuidadeContraceptivo, boolean ofertarConsultaPreventivo, boolean encaminharPreNatalMulher, boolean exameProstataNao, boolean exameProstataSim, String anoProstata, boolean historicoProstataNao, boolean historicoProstataSim, String familiarProstata, boolean vasectomiaNao, boolean vasectomiaSim, boolean parceiraGestanteNao, boolean parceiraGestanteSim, boolean participandoPreNatalNao, boolean participandoPreNatalSim, boolean ofertarVasectomia, boolean encaminharPreNatalParceiro, boolean capsNao, boolean capsSim, String nomeMunicipioCaps, boolean ansiedadeNao, boolean ansiedadeSim, boolean depressaoNao, boolean depressaoSim, boolean bipolaridadeNao, boolean bipolaridadeSim, boolean esquizofreniaNao, boolean esquizofreniaSim, boolean autismoNao, boolean autismoSim, String outroTranstorno, boolean transtornoNaoSabe, boolean medicamentoControladoNao, boolean medicamentoControladoSim, String qualMedicamentoControlado, boolean medicamentoControladoNaoSabe, boolean acompanhamentoPrisaoNao, boolean acompanhamentoPrisaoSim, String motivoAcompanhamento, boolean usoAlcoolNao, boolean usoAlcoolSim, boolean usoCigarroNao, boolean usoCigarroSim, boolean usoMaconhaNao, boolean usoMaconhaSim, boolean usoCrackNao, boolean usoCrackSim, boolean usoCocainaNao, boolean usoCocainaSim, boolean usoAnfetaminasNao, boolean usoAnfetaminasSim, boolean usoDrogasKNao, boolean usoDrogasKSim, boolean usoOutrasSubstanciasNao, boolean usoOutrasSubstanciasSim, String outrasSubstancias, boolean tratamentoCessarNao, boolean tratamentoCessarSim, String substanciaTratamento, boolean desejaTratamentoNao, boolean desejaTratamentoSim, String desejoSubstancia, boolean ofertarConsultaPsicologia, boolean ofertarConsultaPsiquiatria, boolean encaminharRenovacaoReceitas, boolean ofertarGruposApoio, boolean vacinaCovidNao, boolean vacinaCovidSim, boolean vacinaCovidNaoSabe, boolean vacinaInfluenzaNao, boolean vacinaInfluenzaSim, boolean vacinaInfluenzaNaoSabe, boolean vacinaTetanoNao, boolean vacinaTetanoSim, boolean vacinaTetanoNaoSabe, boolean vacinaHepatiteNao, boolean vacinaHepatiteSim, boolean vacinaHepatiteNaoSabe, String peso, String altura, String imc, String pa, String fc, String sat, String temp, boolean tosseSim, boolean tosseNao, boolean corizaSim, boolean corizaNao, boolean espirrosSim, boolean espirrosNao, boolean febreSim, boolean febreNao, boolean calafriosSim, boolean calafriosNao, String outrosSintomas, String dataInicioSintomas, boolean apresentaLesoesSim, boolean apresentaLesoesNao, String apresentaLesoesLocais, String apresentaLesoesConduta, String hiv12Lote, String hiv12Validade, boolean hiv12R, boolean hiv12NR, boolean hiv12NaoRealizado, String hiv22Lote, String hiv22Validade, boolean hiv22R, boolean hiv22NR, boolean hiv22NaoRealizado, String sifilisLote, String sifilisValidade, boolean sifilisR, boolean sifilisNR, boolean sifilisNaoRealizado, String hepatiteBLote, String hepatiteBValidade, boolean hepatiteBR, boolean hepatiteBNR, boolean hepatiteBNaoRealizado, String hepatiteCLote, String hepatiteCValidade, boolean hepatiteCR, boolean hepatiteCNR, boolean hepatiteCNaoRealizado, String covidLote, String covidValidade, boolean covidR, boolean covidNR, boolean covidNaoRealizado, boolean testeGravidezSim, boolean testeGravidezNao, boolean testeGravidezNaoRealizado, boolean algumaQueixaSim, boolean algumaQueixaNao, String algumaQueixaQual, String condutaQueixa, boolean queixaOdontologicaSim, boolean queixaOdontologicaNao, String queixaOdontologicaQual, boolean necessitaDentistaImediatoSim, boolean necessitaDentistaImediatoNao, String condutaOdontologica, String encaminhamentosFinais, String cpf) {
        String sql = "UPDATE pacientes_atendimentos SET " +
    "doenca_pele_nao = ?, doenca_pele_sim = ?, qual_doenca_pele = ?, " +
    "autoimune_nao = ?, autoimune_sim = ?, outra_autoimune = ?, autoimune_nao_sabe = ?, " +
    "obs_autoimune = ?, obs_hepatite = ?, medicamento_continuo_nao = ?, medicamento_continuo_sim = ?, quais_medicamentos = ?, " +
    "contato_enchente_nao = ?, contato_enchente_sim = ?, ano_enchente = ?, descrever_exposicao = ?, " +
    "tipo_sanguineo_a_pos = ?, tipo_sanguineo_a_neg = ?, tipo_sanguineo_b_pos = ?, tipo_sanguineo_b_neg = ?, " +
    "tipo_sanguineo_o_pos = ?, tipo_sanguineo_o_neg = ?, tipo_sanguineo_ab_pos = ?, tipo_sanguineo_ab_neg = ?, " +
    "tipo_sanguineo_nao_sabe = ?, encaminhamento_sangue = ?, gestacao_nao_sabe = ?, gestacao_nao = ?, gestacao_sim = ?, " +
    "idade_gestacional = ?, contraceptivo_nao = ?, anticoncepcional_oral = ?, diu_implante = ?, anticoncepcional_injetavel = ?, " +
    "ligadura_trompas = ?, histerectomia = ?, preventivo_nao = ?, preventivo_sim = ?, ano_preventivo = ?, " +
    "ofertar_continuidade_contraceptivo = ?, ofertar_consulta_preventivo = ?, encaminhar_pre_natal_mulher = ?, " +
    "exame_prostata_nao = ?, exame_prostata_sim = ?, ano_prostata = ?, historico_prostata_nao = ?, historico_prostata_sim = ?, " +
    "familiar_prostata = ?, vasectomia_nao = ?, vasectomia_sim = ?, parceira_gestante_nao = ?, parceira_gestante_sim = ?, " +
    "participando_pre_natal_nao = ?, participando_pre_natal_sim = ?, ofertar_vasectomia = ?, encaminhar_pre_natal_parceiro = ?, " +
    "caps_nao = ?, caps_sim = ?, nome_municipio_caps = ?, ansiedade_nao = ?, ansiedade_sim = ?, depressao_nao = ?, depressao_sim = ?, " +
    "bipolaridade_nao = ?, bipolaridade_sim = ?, esquizofrenia_nao = ?, esquizofrenia_sim = ?, autismo_nao = ?, autismo_sim = ?, " +
    "outro_transtorno = ?, transtorno_nao_sabe = ?, medicamento_controlado_nao = ?, medicamento_controlado_sim = ?, " +
    "qual_medicamento_controlado = ?, medicamento_controlado_nao_sabe = ?, acompanhamento_prisao_nao = ?, acompanhamento_prisao_sim = ?, " +
    "motivo_acompanhamento = ?, uso_alcool_nao = ?, uso_alcool_sim = ?, uso_cigarro_nao = ?, uso_cigarro_sim = ?, " +
    "uso_maconha_nao = ?, uso_maconha_sim = ?, uso_crack_nao = ?, uso_crack_sim = ?, uso_cocaina_nao = ?, uso_cocaina_sim = ?, " +
    "uso_anfetaminas_nao = ?, uso_anfetaminas_sim = ?, uso_drogas_k_nao = ?, uso_drogas_k_sim = ?, uso_outras_substancias_nao = ?, " +
    "uso_outras_substancias_sim = ?, outras_substancias = ?, tratamento_cessar_nao = ?, tratamento_cessar_sim = ?, substancia_tratamento = ?, " +
    "deseja_tratamento_nao = ?, deseja_tratamento_sim = ?, desejo_substancia = ?, ofertar_consulta_psicologia = ?, ofertar_consulta_psiquiatria = ?, " +
    "encaminhar_renovacao_receitas = ?, ofertar_grupos_apoyo = ?, vacina_covid_nao = ?, vacina_covid_sim = ?, vacina_covid_nao_sabe = ?, " +
    "vacina_influenza_nao = ?, vacina_influenza_sim = ?, vacina_influenza_nao_sabe = ?, vacina_tetano_nao = ?, vacina_tetano_sim = ?, vacina_tetano_nao_sabe = ?, " +
    "vacina_hepatite_nao = ?, vacina_hepatite_sim = ?, vacina_hepatite_nao_sabe = ?, peso = ?, altura = ?, imc = ?, pa = ?, fc = ?, sat = ?, temp = ?, " +
    "tosse_sim = ?, tosse_nao = ?, coriza_sim = ?, coriza_nao = ?, espirros_sim = ?, espirros_nao = ?, febre_sim = ?, febre_nao = ?, calafrios_sim = ?, calafrios_nao = ?, " +
    "outros_sintomas = ?, data_inicio_sintomas = ?, apresenta_lesoes_sim = ?, apresenta_lesoes_nao = ?, apresenta_lesoes_locais = ?, apresenta_lesoes_conduta = ?, " +
    "hiv12_lote = ?, hiv12_validade = ?, hiv12_r = ?, hiv12_nr = ?, hiv12_nao_realizado = ?, hiv22_lote = ?, hiv22_validade = ?, hiv22_r = ?, hiv22_nr = ?, hiv22_nao_realizado = ?, " +
    "sifilis_lote = ?, sifilis_validade = ?, sifilis_r = ?, sifilis_nr = ?, sifilis_nao_realizado = ?, hepatite_b_lote = ?, hepatite_b_validade = ?, hepatite_b_r = ?, hepatite_b_nr = ?, hepatite_b_nao_realizado = ?, " +
    "hepatite_c_lote = ?, hepatite_c_validade = ?, hepatite_c_r = ?, hepatite_c_nr = ?, hepatite_c_nao_realizado = ?, covid_lote = ?, covid_validade = ?, covid_r = ?, covid_nr = ?, covid_nao_realizado = ?, " +
    "teste_gravidez_sim = ?, teste_gravidez_nao = ?, teste_gravidez_nao_realizado = ?, alguma_queixa_sim = ?, alguma_queixa_nao = ?, alguma_queixa_qual = ?, conduta_queixa = ?, " +
    "queixa_odontologica_sim = ?, queixa_odontologica_nao = ?, queixa_odontologica_qual = ?, necessita_dentista_imediato_sim = ?, necessita_dentista_imediato_nao = ?, conduta_odontologica = ?, " +
    "encaminhamentos_finais = ? " +
    "WHERE cpf = ?";
        
        try (Connection conexao = ConexaoBanco.abreConexao();
             PreparedStatement pst = conexao.prepareStatement(sql)) {

                int i = 1;
            // Doença de Pele
            pst.setBoolean(i++, doencaPeleNao);
            pst.setBoolean(i++, doencaPeleSim);
            pst.setString(i++, qualDoencaPele);

            // Autoimune
            pst.setBoolean(i++, autoimuneNao);
            pst.setBoolean(i++, autoimuneSim);
            pst.setString(i++, outraAutoimune);
            pst.setBoolean(i++, autoimuneNaoSabe);
            pst.setString(i++, obsAutoimune);

            // Hepatite e Medicamento Contínuo
            pst.setString(i++, obsHepatite);
            pst.setBoolean(i++, medicamentoContinuoNao);
            pst.setBoolean(i++, medicamentoContinuoSim);
            pst.setString(i++, quaisMedicamentos);

            // Contato com Enchente
            pst.setBoolean(i++, contatoEnchenteNao);
            pst.setBoolean(i++, contatoEnchenteSim);
            pst.setString(i++, anoEnchente);
            pst.setString(i++, descreverExposicao);

            // Tipo Sanguíneo
            pst.setBoolean(i++, tipoSanguineoAPos);
            pst.setBoolean(i++, tipoSanguineoANeg);
            pst.setBoolean(i++, tipoSanguineoBPos);
            pst.setBoolean(i++, tipoSanguineoBNeg);
            pst.setBoolean(i++, tipoSanguineoOPos);
            pst.setBoolean(i++, tipoSanguineoONeg);
            pst.setBoolean(i++, tipoSanguineoABPos);
            pst.setBoolean(i++, tipoSanguineoABNeg);
            pst.setBoolean(i++, tipoSanguineoNaoSabe);
            pst.setString(i++, encaminhamentoSangue);

            // Gestação
            pst.setBoolean(i++, gestacaoNaoSabe);
            pst.setBoolean(i++, gestacaoNao);
            pst.setBoolean(i++, gestacaoSim);
            pst.setString(i++, idadeGestacional);

            // Contraceptivo
            pst.setBoolean(i++, contraceptivoNao);
            pst.setBoolean(i++, anticoncepcionalOral);
            pst.setBoolean(i++, diuImplante);
            pst.setBoolean(i++, anticoncepcionalInjetavel);
            pst.setBoolean(i++, ligaduraTrompas);
            pst.setBoolean(i++, histerectomia);

            // Preventivo
            pst.setBoolean(i++, preventivoNao);
            pst.setBoolean(i++, preventivoSim);
            pst.setString(i++, anoPreventivo);

            // Ofertas Femininas
            pst.setBoolean(i++, ofertarContinuidadeContraceptivo);
            pst.setBoolean(i++, ofertarConsultaPreventivo);
            pst.setBoolean(i++, encaminharPreNatalMulher);

            // Exame de Próstata
            pst.setBoolean(i++, exameProstataNao);
            pst.setBoolean(i++, exameProstataSim);
            pst.setString(i++, anoProstata);

            // Histórico de Próstata
            pst.setBoolean(i++, historicoProstataNao);
            pst.setBoolean(i++, historicoProstataSim);
            pst.setString(i++, familiarProstata);

            // Vasectomia
            pst.setBoolean(i++, vasectomiaNao);
            pst.setBoolean(i++, vasectomiaSim);

            // Parceira Gestante
            pst.setBoolean(i++, parceiraGestanteNao);
            pst.setBoolean(i++, parceiraGestanteSim);
            pst.setBoolean(i++, participandoPreNatalNao);
            pst.setBoolean(i++, participandoPreNatalSim);

            // Ofertas Masculinas
            pst.setBoolean(i++, ofertarVasectomia);
            pst.setBoolean(i++, encaminharPreNatalParceiro);

            // CAPS
            pst.setBoolean(i++, capsNao);
            pst.setBoolean(i++, capsSim);
            pst.setString(i++, nomeMunicipioCaps);

            // Transtornos Mentais
            pst.setBoolean(i++, ansiedadeNao);
            pst.setBoolean(i++, ansiedadeSim);
            pst.setBoolean(i++, depressaoNao);
            pst.setBoolean(i++, depressaoSim);
            pst.setBoolean(i++, bipolaridadeNao);
            pst.setBoolean(i++, bipolaridadeSim);
            pst.setBoolean(i++, esquizofreniaNao);
            pst.setBoolean(i++, esquizofreniaSim);
            pst.setBoolean(i++, autismoNao);
            pst.setBoolean(i++, autismoSim);
            pst.setString(i++, outroTranstorno);
            pst.setBoolean(i++, transtornoNaoSabe);

            // Medicamento Controlado
            pst.setBoolean(i++, medicamentoControladoNao);
            pst.setBoolean(i++, medicamentoControladoSim);
            pst.setString(i++, qualMedicamentoControlado);
            pst.setBoolean(i++, medicamentoControladoNaoSabe);

            // Acompanhamento Prisão
            pst.setBoolean(i++, acompanhamentoPrisaoNao);
            pst.setBoolean(i++, acompanhamentoPrisaoSim);
            pst.setString(i++, motivoAcompanhamento);

            // Uso de Substâncias
            pst.setBoolean(i++, usoAlcoolNao);
            pst.setBoolean(i++, usoAlcoolSim);
            pst.setBoolean(i++, usoCigarroNao);
            pst.setBoolean(i++, usoCigarroSim);
            pst.setBoolean(i++, usoMaconhaNao);
            pst.setBoolean(i++, usoMaconhaSim);
            pst.setBoolean(i++, usoCrackNao);
            pst.setBoolean(i++, usoCrackSim);
            pst.setBoolean(i++, usoCocainaNao);
            pst.setBoolean(i++, usoCocainaSim);
            pst.setBoolean(i++, usoAnfetaminasNao);
            pst.setBoolean(i++, usoAnfetaminasSim);
            pst.setBoolean(i++, usoDrogasKNao);
            pst.setBoolean(i++, usoDrogasKSim);
            pst.setBoolean(i++, usoOutrasSubstanciasNao);
            pst.setBoolean(i++, usoOutrasSubstanciasSim);
            pst.setString(i++, outrasSubstancias);

            // Tratamento para Cessar Uso
            pst.setBoolean(i++, tratamentoCessarNao);
            pst.setBoolean(i++, tratamentoCessarSim);
            pst.setString(i++, substanciaTratamento);
            pst.setBoolean(i++, desejaTratamentoNao);
            pst.setBoolean(i++, desejaTratamentoSim);
            pst.setString(i++, desejoSubstancia);

            // Ofertas Psicológicas/Psiquiátricas
            pst.setBoolean(i++, ofertarConsultaPsicologia);
            pst.setBoolean(i++, ofertarConsultaPsiquiatria);
            pst.setBoolean(i++, encaminharRenovacaoReceitas);
            pst.setBoolean(i++, ofertarGruposApoio);

            // Vacinas
            pst.setBoolean(i++, vacinaCovidNao);
            pst.setBoolean(i++, vacinaCovidSim);
            pst.setBoolean(i++, vacinaCovidNaoSabe);
            pst.setBoolean(i++, vacinaInfluenzaNao);
            pst.setBoolean(i++, vacinaInfluenzaSim);
            pst.setBoolean(i++, vacinaInfluenzaNaoSabe);
            pst.setBoolean(i++, vacinaTetanoNao);
            pst.setBoolean(i++, vacinaTetanoSim);
            pst.setBoolean(i++, vacinaTetanoNaoSabe);
            pst.setBoolean(i++, vacinaHepatiteNao);
            pst.setBoolean(i++, vacinaHepatiteSim);
            pst.setBoolean(i++, vacinaHepatiteNaoSabe);

            // Medidas Antropométricas e Sinais Vitais
            pst.setString(i++, peso);
            pst.setString(i++, altura);
            pst.setString(i++, imc);
            pst.setString(i++, pa);
            pst.setString(i++, fc);
            pst.setString(i++, sat);
            pst.setString(i++, temp);

            // Sintomas Respiratórios
            pst.setBoolean(i++, tosseSim);
            pst.setBoolean(i++, tosseNao);
            pst.setBoolean(i++, corizaSim);
            pst.setBoolean(i++, corizaNao);
            pst.setBoolean(i++, espirrosSim);
            pst.setBoolean(i++, espirrosNao);
            pst.setBoolean(i++, febreSim);
            pst.setBoolean(i++, febreNao);
            pst.setBoolean(i++, calafriosSim);
            pst.setBoolean(i++, calafriosNao);
            pst.setString(i++, outrosSintomas);
            pst.setString(i++, dataInicioSintomas);

            // Lesões na Pele
            pst.setBoolean(i++, apresentaLesoesSim);
            pst.setBoolean(i++, apresentaLesoesNao);
            pst.setString(i++, apresentaLesoesLocais);
            pst.setString(i++, apresentaLesoesConduta);

            // Testes Rápidos - HIV 1/2
            pst.setString(i++, hiv12Lote);
            pst.setString(i++, hiv12Validade);
            pst.setBoolean(i++, hiv12R);
            pst.setBoolean(i++, hiv12NR);
            pst.setBoolean(i++, hiv12NaoRealizado);

            // Testes Rápidos - HIV 2/2 (Assuming this is for a second HIV test or a typo)
            pst.setString(i++, hiv22Lote);
            pst.setString(i++, hiv22Validade);
            pst.setBoolean(i++, hiv22R);
            pst.setBoolean(i++, hiv22NR);
            pst.setBoolean(i++, hiv22NaoRealizado);

            // Testes Rápidos - Sífilis
            pst.setString(i++, sifilisLote);
            pst.setString(i++, sifilisValidade);
            pst.setBoolean(i++, sifilisR);
            pst.setBoolean(i++, sifilisNR);
            pst.setBoolean(i++, sifilisNaoRealizado);

            // Testes Rápidos - Hepatite B
            pst.setString(i++, hepatiteBLote);
            pst.setString(i++, hepatiteBValidade);
            pst.setBoolean(i++, hepatiteBR);
            pst.setBoolean(i++, hepatiteBNR);
            pst.setBoolean(i++, hepatiteBNaoRealizado);

            // Testes Rápidos - Hepatite C
            pst.setString(i++, hepatiteCLote);
            pst.setString(i++, hepatiteCValidade);
            pst.setBoolean(i++, hepatiteCR);
            pst.setBoolean(i++, hepatiteCNR);
            pst.setBoolean(i++, hepatiteCNaoRealizado);

            // Testes Rápidos - COVID
            pst.setString(i++, covidLote);
            pst.setString(i++, covidValidade);
            pst.setBoolean(i++, covidR);
            pst.setBoolean(i++, covidNR);
            pst.setBoolean(i++, covidNaoRealizado);

            // Teste de Gravidez
            pst.setBoolean(i++, testeGravidezSim);
            pst.setBoolean(i++, testeGravidezNao);
            pst.setBoolean(i++, testeGravidezNaoRealizado);

            // Queixa Geral
            pst.setBoolean(i++, algumaQueixaSim);
            pst.setBoolean(i++, algumaQueixaNao);
            pst.setString(i++, algumaQueixaQual);
            pst.setString(i++, condutaQueixa);

            // Queixa Odontológica
            pst.setBoolean(i++, queixaOdontologicaSim);
            pst.setBoolean(i++, queixaOdontologicaNao);
            pst.setString(i++, queixaOdontologicaQual);
            pst.setBoolean(i++, necessitaDentistaImediatoSim);
            pst.setBoolean(i++, necessitaDentistaImediatoNao);
            pst.setString(i++, condutaOdontologica);

            // Encaminhamentos Finais
            pst.setString(i++, encaminhamentosFinais);

            // WHERE clause parameter
            pst.setString(i++, cpf);

            int linhasAfetadas = pst.executeUpdate();
            System.out.println("Atualização concluída, linhas afetadas: " + linhasAfetadas);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
        public void carregarDadosTabela(DefaultTableModel model){
            
        model.setRowCount(0);
            
        String sql = "SELECT id, nome_completo, cpf, idade, nome_mae FROM pacientes_atendimentos;";
        
        try (Connection conexao = ConexaoBanco.abreConexao();
             PreparedStatement pst = conexao.prepareStatement(sql)) {
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                String id = rs.getString("id");
                String nome_completo = rs.getString("nome_completo");
                String cpf = rs.getString("cpf");
                String idade = rs.getString("idade");
                String nome_mae = rs.getString("nome_mae");
            
                model.addRow(new Object[]{id, nome_completo, cpf, idade, nome_mae});
            }
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            
        }   
    }
        
        public void carregarDadosTabelaPorCpf(DefaultTableModel model, String cpfString){
        String sql = "SELECT id, nome_completo, cpf, idade, nome_mae FROM pacientes_atendimentos WHERE cpf = ?";
        
        model.setRowCount(0);
        
        try (Connection conexao = ConexaoBanco.abreConexao();
             PreparedStatement pst = conexao.prepareStatement(sql)) {
            
            pst.setString(1, cpfString);
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                String id = rs.getString("id");
                String nome_completo = rs.getString("nome_completo");
                String cpf = rs.getString("cpf");
                String idade = rs.getString("idade");
                String nome_mae = rs.getString("nome_mae");
            
                model.addRow(new Object[]{id, nome_completo, cpf, idade, nome_mae});
            }
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
