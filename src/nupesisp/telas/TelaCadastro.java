package nupesisp.telas;
import java.awt.Component;
import java.awt.Container;
import nupesisp.processos.Process;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author douglas
 */
public final class TelaCadastro extends JFrame {

    nupesisp.processos.Process process = new nupesisp.processos.Process();
    
   private DefaultTableModel model;
    
    
    // Painéis principais
    private JPanel mainPanel;
    private JPanel jpnAtendimento;
    private JPanel jpaIdentificacao;
    private JPanel jpaSociaisEconomicos;
    private JPanel jpaCondicoesSaude;
    private JPanel jpaSaudeComplementar;
    private JPanel jpaSaudeMulher;
    private JPanel jpaSaudeHomem;
    private JPanel jpaSaudeMental;
    private JPanel jpaEncaminhamentosGerais; // Renomeado para evitar conflito com painel interno
    private JPanel jpaVacinal;

    
    // Componentes do painel de Atendimento
    private JLabel txtResponsavelAtendimento;
    private JTextField jtfResponsavelAtendimento;
    private JLabel txtData;
    private JTextField dataAtendimento;
    private JCheckBox jcbTransferenciaUnidade;
    private JLabel txtProcedencia;
    private JTextField jtfProcedencia;

    // Componentes do painel de Identificação
    private JLabel txtNomeCompleto;
    private JTextField jtfNomeCompleto;
    private JLabel txtNomeSocial;
    private JTextField jtfNomeSocial;
    private JLabel txtDataNasc;
    private JTextField jtfDataNasc;
    private JLabel txtIdade;
    private JTextField jtfIdade;
    private JLabel txtCpf;
    private JTextField jtfCpf;

    // Nacionalidade
    private JLabel txtNacionalidade;
    private JCheckBox jcbBr;
    private JCheckBox jcbNaturalizado;
    private JCheckBox jcbEstrangeiro;
    private JLabel txtQualPais;
    private JTextField jtfQualPais;

    // Nome da mãe e Estado civil
    private JLabel txtNomeDaMae;
    private JTextField jtfNomeDaMae;
    private JLabel txtEstadoCivil;
    private JCheckBox jcbSolteiro;
    private JCheckBox jcbCasado;
    private JCheckBox jcbUniaoEstavel;
    private JCheckBox jcOutroEstadoCivil; // Renomeado
    private JTextField jtfEstadoCivilOutro;

    // Raça cor
    private JLabel txtRacaCor;
    private JCheckBox jcbBranco;
    private JCheckBox jcbPreto;
    private JCheckBox jcbPardo;
    private JCheckBox jcbAmarelo;
    private JCheckBox jcbIndigena;
    private JLabel txtQualEtnia;
    private JTextField jtfQualEtinia;

    // Sexo Biológico
    private JLabel txtSexoBiologico;
    private JCheckBox jcbFeminino;
    private JCheckBox jcbMasculino;
    private JCheckBox jcbIntersexual;
    private JCheckBox jcbNDInformarSexo; // Renomeado

    // Identidade de Gênero
    private JLabel txtIdentGenero;
    private JCheckBox jcbHomem;
    private JCheckBox jcbMulher;
    private JCheckBox jcbHomemTrans;
    private JCheckBox jcbMulherTravesti;
    private JCheckBox jcbNaoBinario;
    private JCheckBox jcbNDInformarIdentGenero;

    // Orientação Sexual
    private JLabel txtOrientacaoSexual;
    private JCheckBox jcbHetero;
    private JCheckBox jcbHomo;
    private JCheckBox jcbBi;
    private JCheckBox jcbOutraOrientacao;
    private JLabel txtOutraOrientacaoSexual;
    private JTextField jtfOutraOrientacaoSexual;
    private JCheckBox jcbNDOrientacao;

    // Componentes do painel Dados Sociais e Econômicos
    // Escolaridade
    private JLabel txtEscolaridade; // Adicionado
    private ButtonGroup grupoEscolaridade;
    private JRadioButton rbFundamentalInc;
    private JRadioButton rbFundamentalComp;
    private JRadioButton rbMedioInc;
    private JRadioButton rbMedioComp;
    private JRadioButton rbSuperiorInc;
    private JRadioButton rbSuperiorComp;

    // Benefício
    private JLabel txtBeneficioFamilia; // Adicionado
    private ButtonGroup grupoBeneficio;
    private JRadioButton rbBeneficioNao;
    private JRadioButton rbBeneficioSim;
    private JLabel txtQualBeneficio; // Adicionado
    private JTextField jtfQualBeneficio;

    // Filhos
    private JLabel txtPossuiFilhos; // Adicionado
    private ButtonGroup grupoFilhos;
    private JRadioButton rbFilhosNao;
    private JRadioButton rbFilhosSim;
    private JLabel txtQtdFilhos; // Adicionado
    private JTextField jtfQtdFilhos;

    // Dependentes
    private JLabel txtOutrosDependentes; // Adicionado
    private ButtonGroup grupoDependentes; // Adicionado
    private JRadioButton rbDepNao;
    private JRadioButton rbDepSim;
    private JLabel txtQtdDependentes; // Adicionado
    private JTextField jtfQtdDependentes;

    // Idade (Social e Econômicos)
    private JLabel txtIdadeSocial; // Adicionado
    private JTextField jtfIdadeSocial;

    // Encaminhamentos (Sociais e Econômicos)
    private JLabel txtEncaminhamentosSociais; // Adicionado
    private JCheckBox jcbEncaminhamentoNEEJA;
    private JCheckBox jcbAssistSocial;

    // Componentes do painel Condições de Saúde
    // Deficiência
    private JLabel txtDeficiencia; // Adicionado
    private JCheckBox jcbDeficienciaNao;
    private JCheckBox jcbDeficienciaSim;
    private JLabel txtQualDeficiencia; // Adicionado
    private JTextField jtfDeficiencia;
    private JCheckBox jcbDeficienciaNaoSabe;

    // Alergias
    private JLabel txtAlergias; // Adicionado
    private JCheckBox jcbAlergiasNao;
    private JCheckBox jcbAlergiasSim;
    private JLabel txtQuaisAlergias; // Adicionado
    private JTextField jtfAlergias;
    private JCheckBox jcbAlergiasNaoSabe;

    // Cirurgias
    private JLabel txtRealizouCirurgias; // Adicionado
    private JCheckBox jcbCirurgiasNao;
    private JCheckBox jcbCirurgiasSim;
    private JLabel txtQuaisCirurgias; // Adicionado
    private JTextField jtfCirurgias;
    private JCheckBox jcbCirurgiasNaoSabe;

    // Condições crônicas
    private JLabel txtCronicas; // Adicionado
    private JCheckBox jcbHipertensao;
    private JCheckBox jcbDiabetes;
    private JCheckBox jcbHIV;

    // Doenças infecciosas
    private JLabel txtInfecciosas; // Adicionado
    private JCheckBox jcbSifilis;
    private JCheckBox jcbHPV;
    private JCheckBox jcbTuberculose;

    // Doença de pele
    private JLabel txtPele; // Adicionado
    private JCheckBox jcbPeleNao;
    private JCheckBox jcbPeleSim;
    private JLabel txtQualPele; // Adicionado
    private JTextField jtfPele;

    // Componentes do painel Saúde Complementar
    // Autoimune
    private JLabel txtAutoimune; // Adicionado
    private JCheckBox jcbAutoimuneNao;
    private JCheckBox jcbAutoimuneSim;
    private JLabel txtOutraAutoimune; // Adicionado
    private JTextField jtfAutoimuneOutra;
    private JCheckBox jcbAutoimuneNaoSabe;

    // Observações
    private JLabel txtObsAutoimune; // Adicionado
    private JTextField jtfObsAutoimune;
    private JLabel txtObsHepatite; // Adicionado
    private JTextField jtfObsHepatite;

    // Medicamento contínuo
    private JLabel txtMedicamentoContinuo; // Adicionado
    private JCheckBox jcbMedicamentoContinuoNao;
    private JCheckBox jcbMedicamentoContinuoSim;
    private JLabel txtQuaisMedicamentos; // Adicionado
    private JTextField jtfMedicamentos;

    // Contato com enchente
    private JLabel txtContatoEnchente; // Adicionado
    private JCheckBox jcbEnchenteNao;
    private JCheckBox jcbEnchenteSim;
    private JLabel txtAnoEnchente; // Adicionado
    private JTextField jtfAnoEnchente;

    // Descrever exposição
    private JLabel txtDescreverExposicao; // Adicionado
    private JTextField jtfExposicao;

    // Tipo sanguíneo
    private JLabel txtTipoSanguineo; // Adicionado
    private JCheckBox jcbAPos;
    private JCheckBox jcbANeg;
    private JCheckBox jcbBPos;
    private JCheckBox jcbBNeg;
    private JCheckBox jcbOPos;
    private JCheckBox jcbONeg;
    private JCheckBox jcbABPos;
    private JCheckBox jcbABNeg;
    private JCheckBox jcbNaoSabeTipoSanguineo;

    // Encaminhamentos tipo sanguíneo
    private JLabel txtEncaminhamentoSangue; // Adicionado
    private JTextField jtfEncaminhamentoSangue;

    // Componentes do painel Saúde da Mulher
    // Gestação no momento
    private JLabel txtGestacaoMomento; // Adicionado
    private JCheckBox jcbGestacaoNaoSabe;
    private JCheckBox jcbGestacaoNao;
    private JCheckBox jcbGestacaoSim;
    private JLabel txtIdadeGestacional; // Adicionado
    private JTextField jtfIdadeGestacional;

    // Método contraceptivo
    private JLabel txtMetodoContraceptivo; // Adicionado
    private JCheckBox jcbContraceptivoNao;
    private JCheckBox jcbAnticoncepcionalOral;
    private JCheckBox jcbDIUImplante;
    private JCheckBox jcbAnticoncepcionalInjetavel;
    private JCheckBox jcbLigaduraTrompas;
    private JCheckBox jcbHisterectomia;

    // Exame preventivo
    private JLabel txtExamePreventivo; // Adicionado
    private JCheckBox jcbPreventivoNao;
    private JCheckBox jcbPreventivoSim;
    private JLabel txtAnoPreventivo; // Adicionado
    private JTextField jtfAnoPreventivo;

    // Encaminhamentos Saúde da Mulher
    private JCheckBox jcbOfertarContinuidadeContraceptivo;
    private JCheckBox jcbOfertarConsultaPreventivo;
    private JCheckBox jcbEncaminharPreNatalMulher;

    // Componentes do painel Saúde do Homem
    // Exame de próstata
    private JLabel txtExameProstata; // Adicionado
    private JCheckBox jcbExameProstataNao;
    private JCheckBox jcbExameProstataSim;
    private JLabel txtAnoProstata; // Adicionado
    private JTextField jtfAnoProstata;

    // Histórico familiar
    private JLabel txtHistoricoProstata; // Adicionado
    private JCheckBox jcbHistoricoProstataNao;
    private JCheckBox jcbHistoricoProstataSim;
    private JLabel txtFamiliarProstata; // Adicionado
    private JTextField jtfFamiliarProstata;

    // Vasectomia
    private JLabel txtVasectomia; // Adicionado
    private JCheckBox jcbVasectomiaNao;
    private JCheckBox jcbVasectomiaSim;

    // Parceira gestante
    private JLabel txtParceiraGestante; // Adicionado
    private JCheckBox jcbParceiraGestanteNao;
    private JCheckBox jcbParceiraGestanteSim;
    private JLabel txtParticipandoPreNatal; // Adicionado
    private JCheckBox jcbParticipandoPreNatalNao;
    private JCheckBox jcbParticipandoPreNatalSim;

    // Encaminhamentos Saúde do Homem
    private JCheckBox jcbOfertarVasectomia;
    private JCheckBox jcbEncaminharPreNatalParceiro;

    // Componentes do painel Saúde Mental e Uso de Substâncias
    // Vínculo com CAPS
    private JLabel txtVinculoCAPS; // Adicionado
    private JCheckBox jcbCapsNao;
    private JCheckBox jcbCapsSim;
    private JLabel txtNomeMunicipioCAPS; // Adicionado
    private JTextField jtfCaps;

    // Transtorno mental
    private JLabel txtTranstornoMental; // Adicionado
    private JCheckBox jcbAnsiedadeNao;
    private JCheckBox jcbAnsiedadeSim;
    private JCheckBox jcbDepressaoNao;
    private JCheckBox jcbDepressaoSim;
    private JCheckBox jcbBipolaridadeNao;
    private JCheckBox jcbBipolaridadeSim;
    private JCheckBox jcbEsquizofreniaNao;
    private JCheckBox jcbEsquizofreniaSim;
    private JCheckBox jcbAutismoNao;
    private JCheckBox jcbAutismoSim;
    private JLabel txtOutroTranstorno; // Adicionado
    private JTextField jtfOutroTranstorno;
    private JCheckBox jcbTranstornoNaoSabe;

    // Medicamento controlado
    private JLabel txtMedicamentoControlado; // Adicionado
    private JCheckBox jcbMedicamentoControladoNao;
    private JCheckBox jcbMedicamentoControladoSim;
    private JLabel txtQualMedicamentoControlado; // Adicionado
    private JTextField jtfMedicamentoControlado; // Renomeado
    private JCheckBox jcbMedicamentoControladoNaoSabe;

    // Acompanhamento no momento da prisão
    private JLabel txtAcompanhamentoPrisao; // Adicionado
    private JCheckBox jcbAcompanhamentoPrisaoNao;
    private JCheckBox jcbAcompanhamentoPrisaoSim;
    private JLabel txtMotivoAcompanhamento; // Adicionado
    private JTextField jtfMotivoAcomp;

    // Uso de substâncias
    private JLabel txtUsoAlcool; // Adicionado
    private JCheckBox jcbUsoAlcoolNao;
    private JCheckBox jcbUsoAlcoolSim;
    private JLabel txtUsoCigarro; // Adicionado
    private JCheckBox jcbUsoCigarroNao;
    private JCheckBox jcbUsoCigarroSim;
    private JLabel txtUsoMaconha; // Adicionado
    private JCheckBox jcbUsoMaconhaNao;
    private JCheckBox jcbUsoMaconhaSim;
    private JLabel txtUsoCrack; // Adicionado
    private JCheckBox jcbUsoCrackNao;
    private JCheckBox jcbUsoCrackSim;
    private JLabel txtUsoCocaina; // Adicionado
    private JCheckBox jcbUsoCocainaNao;
    private JCheckBox jcbUsoCocainaSim;
    private JLabel txtUsoAnfetaminas; // Adicionado
    private JCheckBox jcbUsoAnfetaminasNao;
    private JCheckBox jcbUsoAnfetaminasSim;
    private JLabel txtUsoDrogasK; // Adicionado
    private JCheckBox jcbUsoDrogasKNao;
    private JCheckBox jcbUsoDrogasKSim;
    private JLabel txtUsoOutrasSubstancias; // Adicionado
    private JTextField jtfOutrasSubstancias; // Adicionado
    private JCheckBox jcbUsoOutrasSubstanciasNao; // Adicionado
    private JCheckBox jcbUsoOutrasSubstanciasSim; // Adicionado


    // Tratamento para cessar uso
    private JLabel txtTratamentoCessarUso; // Adicionado
    private JCheckBox jcbTratamentoCessarNao;
    private JCheckBox jcbTratamentoCessarSim;
    private JLabel txtSubstanciaTratamento; // Adicionado
    private JTextField jtfSubstanciaTratamento;

    // Deseja realizar tratamento?
    private JLabel txtDesejaTratamento; // Adicionado
    private JCheckBox jcbDesejaTratamentoNao;
    private JCheckBox jcbDesejaTratamentoSim;
    private JLabel txtDesejoSubstancia; // Adicionado
    private JTextField jtfDesejoSubstancia;

    // Componentes do painel Encaminhamentos Gerais
    private JCheckBox jcbOfertarConsultaPsicologia;
    private JCheckBox jcbOfertarConsultaPsiquiatria;
    private JCheckBox jcbEncaminharRenovacaoReceitas;
    private JCheckBox jcbOfertarGruposApoio;

    // Componentes do painel Situação Vacinal
    private JLabel txtVacinaCovid;
    private JCheckBox jcbVacinaCovidNao;
    private JLabel txtVacinaInfluenza;
    private JCheckBox jcbVacinaInfluenzaNao;
    private JLabel txtVacinaTetano;
    private JCheckBox jcbVacinaTetanoNao;
    private JLabel txtVacinaHepatite;
    private JCheckBox jcbVacinaHepatiteNao;
    private JCheckBox jcbVacinaCovidSim;
    private JCheckBox jcbVacinaCovidNaoSabe;
    private JCheckBox jcbVacinaInfluenzaSim;
    private JCheckBox jcbVacinaInfluenzaNaoSabe;
    private JCheckBox jcbVacinaTetanoSim;
    private JCheckBox jcbVacinaTetanoNaoSabe;
    private JCheckBox jcbVacinaHepatiteSim;
    private JCheckBox jcbVacinaHepatiteNaoSabe;
    private JTextField jtfPeso; 
    private JTextField jtfAltura;
    private JTextField jtfIMC;

    // --- Vital Signs ---
    private JTextField jtfPa; 
    private JTextField jtfFC; 
    private JTextField jtfSat;
    private JTextField jtfTemp; 

    // --- Respiratory Symptoms ---
    private JCheckBox jcbTosseSim; 
    private JCheckBox jcbTosseNao; 
    private JCheckBox jcbCorizaSim; 
    private JCheckBox jcbCorizaNao; 
    private JCheckBox jcbEspirrosSim; 
    private JCheckBox jcbEspirrosNao;
    private JCheckBox jcbFebreSim; 
    private JCheckBox jcbFebreNao;
    private JCheckBox jcbCalafriosSim;
    private JCheckBox jcbCalafriosNao; 
    private JTextField jtfOutrosSintomas; 
    private JTextField jtfDataDeInicioSintomas; 

    // --- Lesions ---
    private JCheckBox jcbApresentaLesoesSim;
    private JCheckBox jcbApresentaLesoesNao; 
    private JTextField jtfApresentaLesoesLocais;
    private JTextField jtfApresentaLesoesConduta;

    // --- Rapid Tests ---
    // HIV (1/2)
    private JTextField jtfHIV12Lote;
    private JTextField jtfHIV12Validade; 
    private JCheckBox jcbHIV12R; 
    private JCheckBox jcbHIV12NR; 
    private JCheckBox jcbHIV12NaoRealizado; 

    // HIV (2/2)
    private JTextField jtfHIV22Lote;
    private JTextField jtfHIV22Validade;
    private JCheckBox jcbHIV22R;
    private JCheckBox jcbHIV22NR;
    private JCheckBox jcbHIV22NaoRealizado;

    // Syphilis
    private JTextField jtfSifilisLote;
    private JTextField jtfSifilisValidade;
    private JCheckBox jcbSifilisR;
    private JCheckBox jcbSifilisNR;
    private JCheckBox jcbSifilisNaoRealizado;

    // Hepatitis B
    private JTextField jtfHepatiteBLote;
    private JTextField jtfHepatiteBValidade;
    private JCheckBox jcbHepatiteBR;
    private JCheckBox jcbHepatiteBNR;
    private JCheckBox jcbHepatiteBNaoRealizado;

    // Hepatitis C
    private JTextField jtfHepatiteCLote;
    private JTextField jtfHepatiteCValidade;
    private JCheckBox jcbHepatiteCR;
    private JCheckBox jcbHepatiteCNR;
    private JCheckBox jcbHepatiteCNaoRealizado;

    // Covid
    private JTextField jtfCovidLote;
    private JTextField jtfCovidValidade;
    private JCheckBox jcbCovidR;
    private JCheckBox jcbCovidNR;
    private JCheckBox jcbCovidNaoRealizado;

    // Pregnancy Test
    private JCheckBox jcbTesteGravidezrSim; 
    private JCheckBox jcbTesteGravidezNao;
    private JCheckBox jcbTesteGravidezNaoRealizado;

    // Complaints (Queixas)
    private JCheckBox jcbAlgumaQueixaSim; 
    private JCheckBox jcbAlgumaQueixaNao; 
    private JTextField jtfQueixa; 
    private JTextField jtfConduta; 

    // Dental Complaints (Queixas Odontológicas)
    private JCheckBox jcbAlgumaQueixaOdontologicaSim; 
    private JCheckBox jcbAlgumaQueixaOdontologicaNao; 
    private JTextField jtfQueixaOdontologicaQual;
    private JCheckBox jcbNecessitaDentisaImediatoSim; 
    private JCheckBox jcbNecessitaDentisaImediatoNao; 
    private JTextField jtfCondutaOdontologicaQual; 

    // Final Referrals
    private JTextField jtfEncaminhamentosFinais;
   
    

    public TelaCadastro(DefaultTableModel model) {
        this.model = model;
        
        
        
        setTitle("Ficha de cadastro");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1920, 1080);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Painel Atendimento
        jpnAtendimento = new JPanel(new GridLayout(0, 2, 5, 5));
        TitledBorder bordaAtendimento = BorderFactory.createTitledBorder("Atendimento");
        jpnAtendimento.setBorder(bordaAtendimento);

        txtResponsavelAtendimento = new JLabel("Responsável pelo atendimento:");
        jtfResponsavelAtendimento = new JTextField(10);
        txtData = new JLabel("Data:");
        dataAtendimento = new JTextField(10);
        jcbTransferenciaUnidade = new JCheckBox("Transferência de outra Unidade prisional");
        txtProcedencia = new JLabel("Se sim, qual a procedência:");
        jtfProcedencia = new JTextField(10);

        jpnAtendimento.add(txtResponsavelAtendimento);
        jpnAtendimento.add(jtfResponsavelAtendimento);
        jpnAtendimento.add(txtData);
        jpnAtendimento.add(dataAtendimento);
        jpnAtendimento.add(jcbTransferenciaUnidade);
        jpnAtendimento.add(txtProcedencia);
        jpnAtendimento.add(jtfProcedencia);

        mainPanel.add(jpnAtendimento);

        // Painel Identificação
        jpaIdentificacao = new JPanel();
        jpaIdentificacao.setLayout(new BoxLayout(jpaIdentificacao, BoxLayout.Y_AXIS));
        TitledBorder bordaIdentificacao = BorderFactory.createTitledBorder("Identificação");
        jpaIdentificacao.setBorder(bordaIdentificacao);

        // Nome Completo
        JPanel jpaNomeCompleto = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtNomeCompleto = new JLabel("Nome Completo:");
        jtfNomeCompleto = new JTextField(10);
        jpaNomeCompleto.add(txtNomeCompleto);
        jpaNomeCompleto.add(jtfNomeCompleto);
        jpaIdentificacao.add(jpaNomeCompleto);

        // Nome Social
        JPanel jpaNomeSocial = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtNomeSocial = new JLabel("Nome Social:");
        jtfNomeSocial = new JTextField(10);
        jpaNomeSocial.add(txtNomeSocial);
        jpaNomeSocial.add(jtfNomeSocial);
        jpaIdentificacao.add(jpaNomeSocial);

        // Data de Nascimento
        JPanel jpaDataNascimento = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtDataNasc = new JLabel("Data de Nascimento:");
        jtfDataNasc = new JTextField(10);
        jpaDataNascimento.add(txtDataNasc);
        jpaDataNascimento.add(jtfDataNasc);
        jpaIdentificacao.add(jpaDataNascimento);

        // Idade
        JPanel jpaIdadeIdentificacao = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Renomeado
        txtIdade = new JLabel("Idade");
        jtfIdade = new JTextField(5);
        jpaIdadeIdentificacao.add(txtIdade);
        jpaIdadeIdentificacao.add(jtfIdade);
        jpaIdentificacao.add(jpaIdadeIdentificacao);

        // CPF
        JPanel jpaCpf = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtCpf = new JLabel("CPF:");
        jtfCpf = new JTextField(10);
        jpaCpf.add(txtCpf);
        jpaCpf.add(jtfCpf);
        jpaIdentificacao.add(jpaCpf);

        // Nacionalidade
        JPanel pnlNacionalidade = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtNacionalidade = new JLabel("Nacionalidade:");
        jcbBr = new JCheckBox("Brasileiro");
        jcbNaturalizado = new JCheckBox("Naturalizado");
        jcbEstrangeiro = new JCheckBox("Estrangeiro");
        txtQualPais = new JLabel("Qual País?");
        jtfQualPais = new JTextField(20);
        pnlNacionalidade.add(txtNacionalidade);
        pnlNacionalidade.add(jcbBr);
        pnlNacionalidade.add(jcbNaturalizado);
        pnlNacionalidade.add(jcbEstrangeiro);
        pnlNacionalidade.add(txtQualPais);
        pnlNacionalidade.add(jtfQualPais);
        jpaIdentificacao.add(pnlNacionalidade);

        // Nome da mãe e Estado civil
        JPanel jpaNomeDaMae = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtNomeDaMae = new JLabel("Nome da mãe:");
        jtfNomeDaMae = new JTextField(10);
        jpaNomeDaMae.add(txtNomeDaMae);
        jpaNomeDaMae.add(jtfNomeDaMae);
        jpaIdentificacao.add(jpaNomeDaMae);

        JPanel pnlEstadoCivil = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtEstadoCivil = new JLabel("Estado Civil:");
        jcbSolteiro = new JCheckBox("Solteiro");
        jcbCasado = new JCheckBox("Casado");
        jcbUniaoEstavel = new JCheckBox("União Estável");
        jcOutroEstadoCivil = new JCheckBox("Outro:");
        jtfEstadoCivilOutro = new JTextField(10);
        pnlEstadoCivil.add(txtEstadoCivil);
        pnlEstadoCivil.add(jcbSolteiro);
        pnlEstadoCivil.add(jcbCasado);
        pnlEstadoCivil.add(jcbUniaoEstavel);
        pnlEstadoCivil.add(jcOutroEstadoCivil);
        pnlEstadoCivil.add(jtfEstadoCivilOutro);
        jpaIdentificacao.add(pnlEstadoCivil);

        
        // Raça cor
        JPanel jpaRacaCor = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtRacaCor = new JLabel("Raça/Cor:");
        jcbBranco = new JCheckBox("Branco");
        jcbPreto = new JCheckBox("Preto");
        jcbPardo = new JCheckBox("Pardo");
        jcbAmarelo = new JCheckBox("Amarelo");
        jcbIndigena = new JCheckBox("Indígena");
        txtQualEtnia = new JLabel("Qual etnia?");
        jtfQualEtinia = new JTextField(20);
        jpaRacaCor.add(txtRacaCor);
        jpaRacaCor.add(jcbBranco);
        jpaRacaCor.add(jcbPreto);
        jpaRacaCor.add(jcbPardo);
        jpaRacaCor.add(jcbAmarelo);
        jpaRacaCor.add(jcbIndigena);
        jpaRacaCor.add(txtQualEtnia);
        jpaRacaCor.add(jtfQualEtinia);
        jpaIdentificacao.add(jpaRacaCor);

        // Sexo Biológico
        JPanel pnlSexoBiologico = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtSexoBiologico = new JLabel("Sexo Biológico:");
        jcbFeminino = new JCheckBox("Feminino");
        jcbMasculino = new JCheckBox("Masculino");
        jcbIntersexual = new JCheckBox("Intersexual");
        jcbNDInformarSexo = new JCheckBox("Não desejo informar");
        pnlSexoBiologico.add(txtSexoBiologico);
        pnlSexoBiologico.add(jcbFeminino);
        pnlSexoBiologico.add(jcbMasculino);
        pnlSexoBiologico.add(jcbIntersexual);
        pnlSexoBiologico.add(jcbNDInformarSexo);
        jpaIdentificacao.add(pnlSexoBiologico);

        // Identidade de Gênero
        JPanel pnlIdentGenero = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtIdentGenero = new JLabel("Identidade de Gênero:");
        jcbHomem = new JCheckBox("Homem");
        jcbMulher = new JCheckBox("Mulher");
        jcbHomemTrans = new JCheckBox("Homem Trans");
        jcbMulherTravesti = new JCheckBox("Mulher Trans / Travesti");
        jcbNaoBinario = new JCheckBox("Não Binário");
        jcbNDInformarIdentGenero = new JCheckBox("Não desejo informar");
        pnlIdentGenero.add(txtIdentGenero);
        pnlIdentGenero.add(jcbHomem);
        pnlIdentGenero.add(jcbMulher);
        pnlIdentGenero.add(jcbHomemTrans);
        pnlIdentGenero.add(jcbMulherTravesti);
        pnlIdentGenero.add(jcbNaoBinario);
        pnlIdentGenero.add(jcbNDInformarIdentGenero);
        jpaIdentificacao.add(pnlIdentGenero);

        // Orientação Sexual
        JPanel pnlOrientacaoSexual = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtOrientacaoSexual = new JLabel("Orientação Sexual:");
        jcbHetero = new JCheckBox("Heterossexual");
        jcbHomo = new JCheckBox("Homossexual(gay/lesbica)");
        jcbBi = new JCheckBox("Bissexual");
        jcbOutraOrientacao = new JCheckBox("Outra");
        txtOutraOrientacaoSexual = new JLabel("Qual:");
        jtfOutraOrientacaoSexual = new JTextField(10);
        jcbNDOrientacao = new JCheckBox("Não desejo informar");
        pnlOrientacaoSexual.add(txtOrientacaoSexual);
        pnlOrientacaoSexual.add(jcbHetero);
        pnlOrientacaoSexual.add(jcbHomo);
        pnlOrientacaoSexual.add(jcbBi);
        pnlOrientacaoSexual.add(jcbOutraOrientacao);
        pnlOrientacaoSexual.add(txtOutraOrientacaoSexual);
        pnlOrientacaoSexual.add(jtfOutraOrientacaoSexual);
        pnlOrientacaoSexual.add(jcbNDOrientacao);
        jpaIdentificacao.add(pnlOrientacaoSexual);

        mainPanel.add(jpaIdentificacao);
        JButton btnCheck1 = new JButton("Adicionar");
        btnCheck1.addActionListener(evt -> btncheck1event(evt));
        mainPanel.add(btnCheck1);

        // Painel Dados Sociais e Econômicos
        jpaSociaisEconomicos = new JPanel();
        jpaSociaisEconomicos.setLayout(new BoxLayout(jpaSociaisEconomicos, BoxLayout.Y_AXIS));
        jpaSociaisEconomicos.setBorder(BorderFactory.createTitledBorder("Dados Sociais e Econômicos"));

        // Escolaridade
        JPanel pnlEscolaridade = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtEscolaridade = new JLabel("Escolaridade:");
        grupoEscolaridade = new ButtonGroup();
        rbFundamentalInc = new JRadioButton("Fundamental incompleto");
        rbFundamentalComp = new JRadioButton("Fundamental completo");
        rbMedioInc = new JRadioButton("Médio incompleto");
        rbMedioComp = new JRadioButton("Médio completo");
        rbSuperiorInc = new JRadioButton("Superior incompleto");
        rbSuperiorComp = new JRadioButton("Superior completo");
        grupoEscolaridade.add(rbFundamentalInc);
        grupoEscolaridade.add(rbFundamentalComp);
        grupoEscolaridade.add(rbMedioInc);
        grupoEscolaridade.add(rbMedioComp);
        grupoEscolaridade.add(rbSuperiorInc);
        grupoEscolaridade.add(rbSuperiorComp);
        pnlEscolaridade.add(txtEscolaridade);
        pnlEscolaridade.add(rbFundamentalInc);
        pnlEscolaridade.add(rbFundamentalComp);
        pnlEscolaridade.add(rbMedioInc);
        pnlEscolaridade.add(rbMedioComp);
        pnlEscolaridade.add(rbSuperiorInc);
        pnlEscolaridade.add(rbSuperiorComp);
        jpaSociaisEconomicos.add(pnlEscolaridade);

        // Benefício
        JPanel pnlBeneficio = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtBeneficioFamilia = new JLabel("A família recebe algum benefício atualmente?");
        grupoBeneficio = new ButtonGroup();
        rbBeneficioNao = new JRadioButton("Não");
        rbBeneficioSim = new JRadioButton("Sim");
        grupoBeneficio.add(rbBeneficioNao);
        grupoBeneficio.add(rbBeneficioSim);
        pnlBeneficio.add(txtBeneficioFamilia);
        pnlBeneficio.add(rbBeneficioNao);
        pnlBeneficio.add(rbBeneficioSim);
        txtQualBeneficio = new JLabel("Qual:");
        jtfQualBeneficio = new JTextField(20);
        pnlBeneficio.add(txtQualBeneficio);
        pnlBeneficio.add(jtfQualBeneficio);
        jpaSociaisEconomicos.add(pnlBeneficio);

        // Filhos
        JPanel pnlFilhos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtPossuiFilhos = new JLabel("Possui filhos?");
        grupoFilhos = new ButtonGroup();
        rbFilhosNao = new JRadioButton("Não");
        rbFilhosSim = new JRadioButton("Sim");
        grupoFilhos.add(rbFilhosNao);
        grupoFilhos.add(rbFilhosSim);
        pnlFilhos.add(txtPossuiFilhos);
        pnlFilhos.add(rbFilhosNao);
        pnlFilhos.add(rbFilhosSim);
        txtQtdFilhos = new JLabel("Quantos:");
        jtfQtdFilhos = new JTextField(20);
        pnlFilhos.add(txtQtdFilhos);
        pnlFilhos.add(jtfQtdFilhos);
        jpaSociaisEconomicos.add(pnlFilhos);

        // Dependentes
        JPanel pnlDependentes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtOutrosDependentes = new JLabel("Possui outros dependentes?");
        grupoDependentes = new ButtonGroup();
        rbDepNao = new JRadioButton("Não");
        rbDepSim = new JRadioButton("Sim");
        grupoDependentes.add(rbDepNao);
        grupoDependentes.add(rbDepSim);
        pnlDependentes.add(txtOutrosDependentes);
        pnlDependentes.add(rbDepNao);
        pnlDependentes.add(rbDepSim);
        txtQtdDependentes = new JLabel("Quantos:");
        jtfQtdDependentes = new JTextField(20);
        pnlDependentes.add(txtQtdDependentes);
        pnlDependentes.add(jtfQtdDependentes);
        jpaSociaisEconomicos.add(pnlDependentes);

        // Idade (no contexto de Dados Sociais e Econômicos)
        JPanel pnlIdadeSocial = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtIdadeSocial = new JLabel("Idade:");
        jtfIdadeSocial = new JTextField(20);
        pnlIdadeSocial.add(txtIdadeSocial);
        pnlIdadeSocial.add(jtfIdadeSocial);
        jpaSociaisEconomicos.add(pnlIdadeSocial);

        // Encaminhamentos (Sociais e Econômicos)
        JPanel pnlEncaminhamentosSociais = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtEncaminhamentosSociais = new JLabel("Encaminhamentos:");
        jcbEncaminhamentoNEEJA = new JCheckBox("Ofertar encaminhamento para o NEEJA");
        jcbAssistSocial = new JCheckBox("Conversar com a Assistência Social");
        pnlEncaminhamentosSociais.add(txtEncaminhamentosSociais);
        pnlEncaminhamentosSociais.add(jcbEncaminhamentoNEEJA);
        pnlEncaminhamentosSociais.add(jcbAssistSocial);
        jpaSociaisEconomicos.add(pnlEncaminhamentosSociais);

        mainPanel.add(jpaSociaisEconomicos);

        // Painel Condições de Saúde
        jpaCondicoesSaude = new JPanel();
        jpaCondicoesSaude.setLayout(new BoxLayout(jpaCondicoesSaude, BoxLayout.Y_AXIS));
        jpaCondicoesSaude.setBorder(BorderFactory.createTitledBorder("Condições de Saúde"));

        // Deficiência
        JPanel pnlDeficiencia = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtDeficiencia = new JLabel("Possui alguma deficiência:");
        jcbDeficienciaNao = new JCheckBox("Não");
        jcbDeficienciaSim = new JCheckBox("Sim");
        txtQualDeficiencia = new JLabel("Qual(is):");
        jtfDeficiencia = new JTextField(20);
        jcbDeficienciaNaoSabe = new JCheckBox("Não sabe responder");
        pnlDeficiencia.add(txtDeficiencia);
        pnlDeficiencia.add(jcbDeficienciaNao);
        pnlDeficiencia.add(jcbDeficienciaSim);
        pnlDeficiencia.add(txtQualDeficiencia);
        pnlDeficiencia.add(jtfDeficiencia);
        pnlDeficiencia.add(jcbDeficienciaNaoSabe);
        jpaCondicoesSaude.add(pnlDeficiencia);

        // Alergias
        JPanel pnlAlergias = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtAlergias = new JLabel("Possui alergias ou intolerância alimentar:");
        jcbAlergiasNao = new JCheckBox("Não");
        jcbAlergiasSim = new JCheckBox("Sim");
        txtQuaisAlergias = new JLabel("Qual(is):");
        jtfAlergias = new JTextField(20);
        jcbAlergiasNaoSabe = new JCheckBox("Não sabe responder");
        pnlAlergias.add(txtAlergias);
        pnlAlergias.add(jcbAlergiasNao);
        pnlAlergias.add(jcbAlergiasSim);
        pnlAlergias.add(txtQuaisAlergias);
        pnlAlergias.add(jtfAlergias);
        pnlAlergias.add(jcbAlergiasNaoSabe);
        jpaCondicoesSaude.add(pnlAlergias);

        // Cirurgias
        JPanel pnlCirurgias = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtRealizouCirurgias = new JLabel("Realizou cirurgias:");
        jcbCirurgiasNao = new JCheckBox("Não");
        jcbCirurgiasSim = new JCheckBox("Sim");
        txtQuaisCirurgias = new JLabel("Qual(is):");
        jtfCirurgias = new JTextField(20);
        jcbCirurgiasNaoSabe = new JCheckBox("Não sabe responder");
        pnlCirurgias.add(txtRealizouCirurgias);
        pnlCirurgias.add(jcbCirurgiasNao);
        pnlCirurgias.add(jcbCirurgiasSim);
        pnlCirurgias.add(txtQuaisCirurgias);
        pnlCirurgias.add(jtfCirurgias);
        pnlCirurgias.add(jcbCirurgiasNaoSabe);
        jpaCondicoesSaude.add(pnlCirurgias);

        // Condições crônicas
        JPanel pnlCronicas = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtCronicas = new JLabel("Condições crônicas:");
        jcbHipertensao = new JCheckBox("Hipertensão");
        jcbDiabetes = new JCheckBox("Diabetes");
        jcbHIV = new JCheckBox("HIV");
        pnlCronicas.add(txtCronicas);
        pnlCronicas.add(jcbHipertensao);
        pnlCronicas.add(jcbDiabetes);
        pnlCronicas.add(jcbHIV);
        jpaCondicoesSaude.add(pnlCronicas);

        // Doenças infecciosas
        JPanel pnlInfecciosas = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtInfecciosas = new JLabel("Histórico de doenças infecciosas:");
        jcbSifilis = new JCheckBox("Sífilis");
        jcbHPV = new JCheckBox("HPV");
        jcbTuberculose = new JCheckBox("Tuberculose");
        pnlInfecciosas.add(txtInfecciosas);
        pnlInfecciosas.add(jcbSifilis);
        pnlInfecciosas.add(jcbHPV);
        pnlInfecciosas.add(jcbTuberculose);
        jpaCondicoesSaude.add(pnlInfecciosas);

        // Doença de pele
        JPanel pnlPele = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtPele = new JLabel("Possui doença de pele:");
        jcbPeleNao = new JCheckBox("Não");
        jcbPeleSim = new JCheckBox("Sim");
        txtQualPele = new JLabel("Qual(is):");
        jtfPele = new JTextField(20);
        pnlPele.add(txtPele);
        pnlPele.add(jcbPeleNao);
        pnlPele.add(jcbPeleSim);
        pnlPele.add(txtQualPele);
        pnlPele.add(jtfPele);
        jpaCondicoesSaude.add(pnlPele);

        mainPanel.add(jpaCondicoesSaude);

        // Painel Saúde Complementar
        jpaSaudeComplementar = new JPanel();
        jpaSaudeComplementar.setLayout(new BoxLayout(jpaSaudeComplementar, BoxLayout.Y_AXIS));
        jpaSaudeComplementar.setBorder(BorderFactory.createTitledBorder("Saúde Complementar"));

        // Autoimune
        JPanel pnlAutoimune = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtAutoimune = new JLabel("Autoimune:");
        jcbAutoimuneNao = new JCheckBox("Não");
        jcbAutoimuneSim = new JCheckBox("Sim");
        txtOutraAutoimune = new JLabel("Outra:");
        jtfAutoimuneOutra = new JTextField(20);
        jcbAutoimuneNaoSabe = new JCheckBox("Não sabe responder");
        pnlAutoimune.add(txtAutoimune);
        pnlAutoimune.add(jcbAutoimuneNao);
        pnlAutoimune.add(jcbAutoimuneSim);
        pnlAutoimune.add(txtOutraAutoimune);
        pnlAutoimune.add(jtfAutoimuneOutra);
        pnlAutoimune.add(jcbAutoimuneNaoSabe);
        jpaSaudeComplementar.add(pnlAutoimune);

        // Observações
        JPanel pnlObsAutoimune = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtObsAutoimune = new JLabel("Obs.:");
        jtfObsAutoimune = new JTextField(20);
        pnlObsAutoimune.add(txtObsAutoimune);
        pnlObsAutoimune.add(jtfObsAutoimune);
        jpaSaudeComplementar.add(pnlObsAutoimune);

        JPanel pnlObsHepatite = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtObsHepatite = new JLabel("Obs.:");
        jtfObsHepatite = new JTextField(20);
        pnlObsHepatite.add(txtObsHepatite);
        pnlObsHepatite.add(jtfObsHepatite);
        jpaSaudeComplementar.add(pnlObsHepatite);

        // Medicamento contínuo
        JPanel pnlMedicamento = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtMedicamentoContinuo = new JLabel("Usa medicamento contínuo:");
        jcbMedicamentoContinuoNao = new JCheckBox("Não");
        jcbMedicamentoContinuoSim = new JCheckBox("Sim");
        txtQuaisMedicamentos = new JLabel("Qual(is):");
        jtfMedicamentos = new JTextField(20);
        pnlMedicamento.add(txtMedicamentoContinuo);
        pnlMedicamento.add(jcbMedicamentoContinuoNao);
        pnlMedicamento.add(jcbMedicamentoContinuoSim);
        pnlMedicamento.add(txtQuaisMedicamentos);
        pnlMedicamento.add(jtfMedicamentos);
        jpaSaudeComplementar.add(pnlMedicamento);

        // Contato com enchente
        JPanel pnlEnchente = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtContatoEnchente = new JLabel("Já teve contato com água de enchente:");
        jcbEnchenteNao = new JCheckBox("Não");
        jcbEnchenteSim = new JCheckBox("Sim");
        txtAnoEnchente = new JLabel("Ano:");
        jtfAnoEnchente = new JTextField(20);
        pnlEnchente.add(txtContatoEnchente);
        pnlEnchente.add(jcbEnchenteNao);
        pnlEnchente.add(jcbEnchenteSim);
        pnlEnchente.add(txtAnoEnchente);
        pnlEnchente.add(jtfAnoEnchente);
        jpaSaudeComplementar.add(pnlEnchente);

        // Descrever exposição
        JPanel pnlExposicao = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtDescreverExposicao = new JLabel("Descrever quando foi e o tempo de exposição:");
        jtfExposicao = new JTextField(20);
        pnlExposicao.add(txtDescreverExposicao);
        pnlExposicao.add(jtfExposicao);
        jpaSaudeComplementar.add(pnlExposicao);

        // Tipo sanguíneo
        JPanel pnlTipoSanguineo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtTipoSanguineo = new JLabel("Tipo sanguíneo:");
        jcbAPos = new JCheckBox("A+");
        jcbANeg = new JCheckBox("A-");
        jcbBPos = new JCheckBox("B+");
        jcbBNeg = new JCheckBox("B-");
        jcbOPos = new JCheckBox("O+");
        jcbONeg = new JCheckBox("O-");
        jcbABPos = new JCheckBox("AB+");
        jcbABNeg = new JCheckBox("AB-");
        jcbNaoSabeTipoSanguineo = new JCheckBox("Não sabe");

        ButtonGroup grupoTipoSanguineo = new ButtonGroup();
        grupoTipoSanguineo.add(jcbAPos);
        grupoTipoSanguineo.add(jcbANeg);
        grupoTipoSanguineo.add(jcbBPos);
        grupoTipoSanguineo.add(jcbBNeg);
        grupoTipoSanguineo.add(jcbOPos);
        grupoTipoSanguineo.add(jcbONeg);
        grupoTipoSanguineo.add(jcbABPos);
        grupoTipoSanguineo.add(jcbABNeg);
        grupoTipoSanguineo.add(jcbNaoSabeTipoSanguineo);

        pnlTipoSanguineo.add(txtTipoSanguineo);
        pnlTipoSanguineo.add(jcbAPos);
        pnlTipoSanguineo.add(jcbANeg);
        pnlTipoSanguineo.add(jcbBPos);
        pnlTipoSanguineo.add(jcbBNeg);
        pnlTipoSanguineo.add(jcbOPos);
        pnlTipoSanguineo.add(jcbONeg);
        pnlTipoSanguineo.add(jcbABPos);
        pnlTipoSanguineo.add(jcbABNeg);
        pnlTipoSanguineo.add(jcbNaoSabeTipoSanguineo);
        jpaSaudeComplementar.add(pnlTipoSanguineo);

        // Encaminhamentos tipo sanguíneo
        JPanel pnlEncaminhamentoSangue = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtEncaminhamentoSangue = new JLabel("Encaminhamentos:");
        jtfEncaminhamentoSangue = new JTextField(20);
        pnlEncaminhamentoSangue.add(txtEncaminhamentoSangue);
        pnlEncaminhamentoSangue.add(jtfEncaminhamentoSangue);
        jpaSaudeComplementar.add(pnlEncaminhamentoSangue);

        mainPanel.add(jpaSaudeComplementar);

        // Painel Saúde da Mulher
        jpaSaudeMulher = new JPanel();
        jpaSaudeMulher.setLayout(new BoxLayout(jpaSaudeMulher, BoxLayout.Y_AXIS));
        jpaSaudeMulher.setBorder(BorderFactory.createTitledBorder("Saúde da Mulher"));

        // Gestação no momento
        JPanel pnlGestacao = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtGestacaoMomento = new JLabel("Gestação no momento:");
        jcbGestacaoNaoSabe = new JCheckBox("Não sabe");
        jcbGestacaoNao = new JCheckBox("Não");
        jcbGestacaoSim = new JCheckBox("Sim");
        txtIdadeGestacional = new JLabel("Qual a idade gestacional?");
        jtfIdadeGestacional = new JTextField(20);
        pnlGestacao.add(txtGestacaoMomento);
        pnlGestacao.add(jcbGestacaoNaoSabe);
        pnlGestacao.add(jcbGestacaoNao);
        pnlGestacao.add(jcbGestacaoSim);
        pnlGestacao.add(txtIdadeGestacional);
        pnlGestacao.add(jtfIdadeGestacional);
        jpaSaudeMulher.add(pnlGestacao);

        // Método contraceptivo
        JPanel pnlContraceptivo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtMetodoContraceptivo = new JLabel("Faz uso de método contraceptivo?");
        jcbContraceptivoNao = new JCheckBox("Não");
        jcbAnticoncepcionalOral = new JCheckBox("Anticoncepcional oral");
        jcbDIUImplante = new JCheckBox("DIU/Implante");
        jcbAnticoncepcionalInjetavel = new JCheckBox("Anticoncepcional injetável");
        jcbLigaduraTrompas = new JCheckBox("Ligadura de trompas");
        jcbHisterectomia = new JCheckBox("Histerectomia");
        pnlContraceptivo.add(txtMetodoContraceptivo);
        pnlContraceptivo.add(jcbContraceptivoNao);
        pnlContraceptivo.add(jcbAnticoncepcionalOral);
        pnlContraceptivo.add(jcbDIUImplante);
        pnlContraceptivo.add(jcbAnticoncepcionalInjetavel);
        pnlContraceptivo.add(jcbLigaduraTrompas);
        pnlContraceptivo.add(jcbHisterectomia);
        jpaSaudeMulher.add(pnlContraceptivo);

        // Exame preventivo
        JPanel pnlPreventivo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtExamePreventivo = new JLabel("Já realizou exame preventivo/Papanicolau?");
        jcbPreventivoNao = new JCheckBox("Não");
        jcbPreventivoSim = new JCheckBox("Sim");
        txtAnoPreventivo = new JLabel("Qual foi o ano:");
        jtfAnoPreventivo = new JTextField(20);
        pnlPreventivo.add(txtExamePreventivo);
        pnlPreventivo.add(jcbPreventivoNao);
        pnlPreventivo.add(jcbPreventivoSim);
        pnlPreventivo.add(txtAnoPreventivo);
        pnlPreventivo.add(jtfAnoPreventivo);
        jpaSaudeMulher.add(pnlPreventivo);

        // Encaminhamentos Saúde da Mulher
        JPanel pnlEncaminhamentosMulher = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jcbOfertarContinuidadeContraceptivo = new JCheckBox("Ofertar continuidade ou início do método contraceptivo");
        jcbOfertarConsultaPreventivo = new JCheckBox("Ofertar consulta para realizar exame preventivo");
        jcbEncaminharPreNatalMulher = new JCheckBox("Encaminhar para pré-natal");
        pnlEncaminhamentosMulher.add(jcbOfertarContinuidadeContraceptivo);
        pnlEncaminhamentosMulher.add(jcbOfertarConsultaPreventivo);
        pnlEncaminhamentosMulher.add(jcbEncaminharPreNatalMulher);
        jpaSaudeMulher.add(pnlEncaminhamentosMulher);

        mainPanel.add(jpaSaudeMulher);

        // Painel Saúde do Homem
        jpaSaudeHomem = new JPanel();
        jpaSaudeHomem.setLayout(new BoxLayout(jpaSaudeHomem, BoxLayout.Y_AXIS));
        jpaSaudeHomem.setBorder(BorderFactory.createTitledBorder("Saúde do Homem"));

        // Exame de próstata
        JPanel pnlExameProstata = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtExameProstata = new JLabel("Já realizou exame preventivo para o câncer de próstata:");
        jcbExameProstataNao = new JCheckBox("Não");
        jcbExameProstataSim = new JCheckBox("Sim");
        txtAnoProstata = new JLabel("Ano:");
        jtfAnoProstata = new JTextField(20);
        pnlExameProstata.add(txtExameProstata);
        pnlExameProstata.add(jcbExameProstataNao);
        pnlExameProstata.add(jcbExameProstataSim);
        pnlExameProstata.add(txtAnoProstata);
        pnlExameProstata.add(jtfAnoProstata);
        jpaSaudeHomem.add(pnlExameProstata);

        // Histórico familiar
        JPanel pnlHistoricoProstata = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtHistoricoProstata = new JLabel("Possui histórico de câncer de próstata na família:");
        jcbHistoricoProstataNao = new JCheckBox("Não");
        jcbHistoricoProstataSim = new JCheckBox("Sim");
        txtFamiliarProstata = new JLabel("Qual o familiar:");
        jtfFamiliarProstata = new JTextField(20);
        pnlHistoricoProstata.add(txtHistoricoProstata);
        pnlHistoricoProstata.add(jcbHistoricoProstataNao);
        pnlHistoricoProstata.add(jcbHistoricoProstataSim);
        pnlHistoricoProstata.add(txtFamiliarProstata);
        pnlHistoricoProstata.add(jtfFamiliarProstata);
        jpaSaudeHomem.add(pnlHistoricoProstata);

        // Vasectomia
        JPanel pnlVasectomia = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtVasectomia = new JLabel("Você realizou vasectomia:");
        jcbVasectomiaNao = new JCheckBox("Não");
        jcbVasectomiaSim = new JCheckBox("Sim");
        pnlVasectomia.add(txtVasectomia);
        pnlVasectomia.add(jcbVasectomiaNao);
        pnlVasectomia.add(jcbVasectomiaSim);
        jpaSaudeHomem.add(pnlVasectomia);

        // Parceira gestante
        JPanel pnlParceira = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtParceiraGestante = new JLabel("Sua parceira está gestante:");
        jcbParceiraGestanteNao = new JCheckBox("Não");
        jcbParceiraGestanteSim = new JCheckBox("Sim");
        txtParticipandoPreNatal = new JLabel("Você está participando do pré-natal:");
        jcbParticipandoPreNatalNao = new JCheckBox("Não");
        jcbParticipandoPreNatalSim = new JCheckBox("Sim");
        pnlParceira.add(txtParceiraGestante);
        pnlParceira.add(jcbParceiraGestanteNao);
        pnlParceira.add(jcbParceiraGestanteSim);
        pnlParceira.add(txtParticipandoPreNatal);
        pnlParceira.add(jcbParticipandoPreNatalNao);
        pnlParceira.add(jcbParticipandoPreNatalSim);
        jpaSaudeHomem.add(pnlParceira);

        // Encaminhamentos Saúde do Homem
        JPanel pnlEncaminhamentosHomem = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jcbOfertarVasectomia = new JCheckBox("Ofertar encaminhamento para realizar vasectomia");
        jcbEncaminharPreNatalParceiro = new JCheckBox("Encaminhar para pré-natal do parceiro");
        pnlEncaminhamentosHomem.add(jcbOfertarVasectomia);
        pnlEncaminhamentosHomem.add(jcbEncaminharPreNatalParceiro);
        jpaSaudeHomem.add(pnlEncaminhamentosHomem);

        mainPanel.add(jpaSaudeHomem);

        // Painel Saúde Mental e Uso de Substâncias
        jpaSaudeMental = new JPanel();
        jpaSaudeMental.setLayout(new BoxLayout(jpaSaudeMental, BoxLayout.Y_AXIS));
        jpaSaudeMental.setBorder(BorderFactory.createTitledBorder("Saúde Mental e Uso de Substâncias"));

        // Vínculo com CAPS
        JPanel pnlCAPS = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtVinculoCAPS = new JLabel("Possui vínculo com CAPS:");
        jcbCapsNao = new JCheckBox("Não");
        jcbCapsSim = new JCheckBox("Sim");
        txtNomeMunicipioCAPS = new JLabel("Nome e município do CAPS:");
        jtfCaps = new JTextField(20);
        pnlCAPS.add(txtVinculoCAPS);
        pnlCAPS.add(jcbCapsNao);
        pnlCAPS.add(jcbCapsSim);
        pnlCAPS.add(txtNomeMunicipioCAPS);
        pnlCAPS.add(jtfCaps);
        jpaSaudeMental.add(pnlCAPS);

        // Transtorno mental
        JPanel pnlTranstornos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtTranstornoMental = new JLabel("Possui transtorno mental:");

        jcbAnsiedadeNao = new JCheckBox("Ansiedade Não");
        jcbAnsiedadeSim = new JCheckBox("Ansiedade Sim");
        jcbDepressaoNao = new JCheckBox("Depressão Não");
        jcbDepressaoSim = new JCheckBox("Depressão Sim");
        jcbBipolaridadeNao = new JCheckBox("Bipolaridade Não");
        jcbBipolaridadeSim = new JCheckBox("Bipolaridade Sim");
        jcbEsquizofreniaNao = new JCheckBox("Esquizofrenia Não");
        jcbEsquizofreniaSim = new JCheckBox("Esquizofrenia Sim");
        jcbAutismoNao = new JCheckBox("Autismo Não");
        jcbAutismoSim = new JCheckBox("Autismo Sim");

        pnlTranstornos.add(txtTranstornoMental);
        pnlTranstornos.add(jcbAnsiedadeNao);
        pnlTranstornos.add(jcbAnsiedadeSim);
        pnlTranstornos.add(jcbDepressaoNao);
        pnlTranstornos.add(jcbDepressaoSim);
        pnlTranstornos.add(jcbBipolaridadeNao);
        pnlTranstornos.add(jcbBipolaridadeSim);
        pnlTranstornos.add(jcbEsquizofreniaNao);
        pnlTranstornos.add(jcbEsquizofreniaSim);
        pnlTranstornos.add(jcbAutismoNao);
        pnlTranstornos.add(jcbAutismoSim);

        txtOutroTranstorno = new JLabel("Outro:");
        jtfOutroTranstorno = new JTextField(20);
        jcbTranstornoNaoSabe = new JCheckBox("Não sabe responder");
        pnlTranstornos.add(txtOutroTranstorno);
        pnlTranstornos.add(jtfOutroTranstorno);
        pnlTranstornos.add(jcbTranstornoNaoSabe);
        jpaSaudeMental.add(pnlTranstornos);

        // Medicamento controlado
        JPanel pnlMedicamentoControlado = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtMedicamentoControlado = new JLabel("Usa medicamento controlado:");
        jcbMedicamentoControladoNao = new JCheckBox("Não");
        jcbMedicamentoControladoSim = new JCheckBox("Sim");
        txtQualMedicamentoControlado = new JLabel("Qual:");
        jtfMedicamentoControlado = new JTextField(20);
        jcbMedicamentoControladoNaoSabe = new JCheckBox("Não sabe responder");
        pnlMedicamentoControlado.add(txtMedicamentoControlado);
        pnlMedicamentoControlado.add(jcbMedicamentoControladoNao);
        pnlMedicamentoControlado.add(jcbMedicamentoControladoSim);
        pnlMedicamentoControlado.add(txtQualMedicamentoControlado);
        pnlMedicamentoControlado.add(jtfMedicamentoControlado);
        pnlMedicamentoControlado.add(jcbMedicamentoControladoNaoSabe);
        jpaSaudeMental.add(pnlMedicamentoControlado);

        // Acompanhamento no momento da prisão
        JPanel pnlAcompanhamento = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtAcompanhamentoPrisao = new JLabel("Estava em acompanhamento em Saúde Mental no momento da prisão:");
        jcbAcompanhamentoPrisaoNao = new JCheckBox("Não");
        jcbAcompanhamentoPrisaoSim = new JCheckBox("Sim");
        txtMotivoAcompanhamento = new JLabel("Motivo:");
        jtfMotivoAcomp = new JTextField(20);
        pnlAcompanhamento.add(txtAcompanhamentoPrisao);
        pnlAcompanhamento.add(jcbAcompanhamentoPrisaoNao);
        pnlAcompanhamento.add(jcbAcompanhamentoPrisaoSim);
        pnlAcompanhamento.add(txtMotivoAcompanhamento);
        pnlAcompanhamento.add(jtfMotivoAcomp);
        jpaSaudeMental.add(pnlAcompanhamento);

        // Uso de substâncias
        JPanel pnlUsoAlcool = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtUsoAlcool = new JLabel("Faz uso de: Álcool");
        jcbUsoAlcoolNao = new JCheckBox("Não");
        jcbUsoAlcoolSim = new JCheckBox("Sim");
        pnlUsoAlcool.add(txtUsoAlcool);
        pnlUsoAlcool.add(jcbUsoAlcoolNao);
        pnlUsoAlcool.add(jcbUsoAlcoolSim);
        jpaSaudeMental.add(pnlUsoAlcool);

        JPanel pnlUsoCigarro = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtUsoCigarro = new JLabel("Faz uso de: Cigarro");
        jcbUsoCigarroNao = new JCheckBox("Não");
        jcbUsoCigarroSim = new JCheckBox("Sim");
        pnlUsoCigarro.add(txtUsoCigarro);
        pnlUsoCigarro.add(jcbUsoCigarroNao);
        pnlUsoCigarro.add(jcbUsoCigarroSim);
        jpaSaudeMental.add(pnlUsoCigarro);

        JPanel pnlUsoMaconha = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtUsoMaconha = new JLabel("Faz uso de: Maconha");
        jcbUsoMaconhaNao = new JCheckBox("Não");
        jcbUsoMaconhaSim = new JCheckBox("Sim");
        pnlUsoMaconha.add(txtUsoMaconha);
        pnlUsoMaconha.add(jcbUsoMaconhaNao);
        pnlUsoMaconha.add(jcbUsoMaconhaSim);
        jpaSaudeMental.add(pnlUsoMaconha);

        JPanel pnlUsoCrack = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtUsoCrack = new JLabel("Faz uso de: Crack");
        jcbUsoCrackNao = new JCheckBox("Não");
        jcbUsoCrackSim = new JCheckBox("Sim");
        pnlUsoCrack.add(txtUsoCrack);
        pnlUsoCrack.add(jcbUsoCrackNao);
        pnlUsoCrack.add(jcbUsoCrackSim);
        jpaSaudeMental.add(pnlUsoCrack);

        JPanel pnlUsoCocaina = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtUsoCocaina = new JLabel("Faz uso de: Cocaína");
        jcbUsoCocainaNao = new JCheckBox("Não");
        jcbUsoCocainaSim = new JCheckBox("Sim");
        pnlUsoCocaina.add(txtUsoCocaina);
        pnlUsoCocaina.add(jcbUsoCocainaNao);
        pnlUsoCocaina.add(jcbUsoCocainaSim);
        jpaSaudeMental.add(pnlUsoCocaina);

        JPanel pnlUsoAnfetaminas = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtUsoAnfetaminas = new JLabel("Faz uso de: Anfetaminas");
        jcbUsoAnfetaminasNao = new JCheckBox("Não");
        jcbUsoAnfetaminasSim = new JCheckBox("Sim");
        pnlUsoAnfetaminas.add(txtUsoAnfetaminas);
        pnlUsoAnfetaminas.add(jcbUsoAnfetaminasNao);
        pnlUsoAnfetaminas.add(jcbUsoAnfetaminasSim);
        jpaSaudeMental.add(pnlUsoAnfetaminas);

        JPanel pnlUsoDrogasK = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtUsoDrogasK = new JLabel("Faz uso de: Drogas K");
        jcbUsoDrogasKNao = new JCheckBox("Não");
        jcbUsoDrogasKSim = new JCheckBox("Sim");
        pnlUsoDrogasK.add(txtUsoDrogasK);
        pnlUsoDrogasK.add(jcbUsoDrogasKNao);
        pnlUsoDrogasK.add(jcbUsoDrogasKSim);
        jpaSaudeMental.add(pnlUsoDrogasK);

        JPanel pnlUsoOutrasSubstancias = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtUsoOutrasSubstancias = new JLabel("Faz uso de: Outra(s):");
        jcbUsoOutrasSubstanciasNao = new JCheckBox("Não");
        jcbUsoOutrasSubstanciasSim = new JCheckBox("Sim");
        jtfOutrasSubstancias = new JTextField(20);
        pnlUsoOutrasSubstancias.add(txtUsoOutrasSubstancias);
        pnlUsoOutrasSubstancias.add(jcbUsoOutrasSubstanciasNao);
        pnlUsoOutrasSubstancias.add(jcbUsoOutrasSubstanciasSim);
        pnlUsoOutrasSubstancias.add(jtfOutrasSubstancias);
        jpaSaudeMental.add(pnlUsoOutrasSubstancias);


        // Tratamento para cessar uso
        JPanel pnlTratamentoCessar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtTratamentoCessarUso = new JLabel("Já realizou algum tratamento para cessar ou reduzir o uso?");
        jcbTratamentoCessarNao = new JCheckBox("Não");
        jcbTratamentoCessarSim = new JCheckBox("Sim");
        txtSubstanciaTratamento = new JLabel("De qual substância:");
        jtfSubstanciaTratamento = new JTextField(20);
        pnlTratamentoCessar.add(txtTratamentoCessarUso);
        pnlTratamentoCessar.add(jcbTratamentoCessarNao);
        pnlTratamentoCessar.add(jcbTratamentoCessarSim);
        pnlTratamentoCessar.add(txtSubstanciaTratamento);
        pnlTratamentoCessar.add(jtfSubstanciaTratamento);
        jpaSaudeMental.add(pnlTratamentoCessar);

        // Deseja realizar tratamento?
        JPanel pnlDesejaTratamento = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtDesejaTratamento = new JLabel("Gostaria de realizar algum tratamento para cessar ou reduzir o uso?");
        jcbDesejaTratamentoNao = new JCheckBox("Não");
        jcbDesejaTratamentoSim = new JCheckBox("Sim");
        txtDesejoSubstancia = new JLabel("De qual substância:");
        jtfDesejoSubstancia = new JTextField(20);
        pnlDesejaTratamento.add(txtDesejaTratamento);
        pnlDesejaTratamento.add(jcbDesejaTratamentoNao);
        pnlDesejaTratamento.add(jcbDesejaTratamentoSim);
        pnlDesejaTratamento.add(txtDesejoSubstancia);
        pnlDesejaTratamento.add(jtfDesejoSubstancia);
        jpaSaudeMental.add(pnlDesejaTratamento);

        mainPanel.add(jpaSaudeMental);

        // Painel Encaminhamentos Gerais
        jpaEncaminhamentosGerais = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jpaEncaminhamentosGerais.setBorder(BorderFactory.createTitledBorder("Encaminhamentos"));

        jcbOfertarConsultaPsicologia = new JCheckBox("Ofertar consulta com a psicologia:");
        jcbOfertarConsultaPsiquiatria = new JCheckBox("Ofertar consulta com psiquiatria:");
        jcbEncaminharRenovacaoReceitas = new JCheckBox("Encaminhar para renovação de receitas:");
        jcbOfertarGruposApoio = new JCheckBox("Ofertar encaminhamento para grupos de apoio para cessar ou reduzir o uso (se existir):");

        jpaEncaminhamentosGerais.add(jcbOfertarConsultaPsicologia);
        jpaEncaminhamentosGerais.add(jcbOfertarConsultaPsiquiatria);
        jpaEncaminhamentosGerais.add(jcbEncaminharRenovacaoReceitas);
        jpaEncaminhamentosGerais.add(jcbOfertarGruposApoio);

        mainPanel.add(jpaEncaminhamentosGerais);

        // Painel Situação Vacinal
        jpaVacinal = new JPanel(new GridLayout(4, 3, 5, 5));
        jpaVacinal.setBorder(BorderFactory.createTitledBorder("Situação Vacinal"));

        txtVacinaCovid = new JLabel("Recebeu a vacina da Covid-19 no último ano?");
        jcbVacinaCovidNao = new JCheckBox("Não");
        jcbVacinaCovidSim = new JCheckBox("Sim");
        jcbVacinaCovidNaoSabe = new JCheckBox("Não sabe");
        txtVacinaInfluenza = new JLabel("Recebeu a vacina da Influenza no último ano?");
        jcbVacinaInfluenzaNao = new JCheckBox("Não");
        jcbVacinaInfluenzaSim = new JCheckBox("Sim");
        jcbVacinaInfluenzaNaoSabe = new JCheckBox("Não sabe");
        txtVacinaTetano = new JLabel("Recebeu a vacina da Tétano no último ano?");
        jcbVacinaTetanoNao = new JCheckBox("Não");
        jcbVacinaTetanoSim = new JCheckBox("Sim");
        jcbVacinaTetanoNaoSabe = new JCheckBox("Não sabe");
        txtVacinaHepatite = new JLabel("Recebeu a vacina da Hepatite B alguma vez na vida?");
        jcbVacinaHepatiteNao = new JCheckBox("Não");
        jcbVacinaHepatiteSim = new JCheckBox("Sim");
        jcbVacinaHepatiteNaoSabe = new JCheckBox("Não sabe");
        jpaVacinal.add(txtVacinaCovid);
        jpaVacinal.add(jcbVacinaCovidNao);
        jpaVacinal.add(jcbVacinaCovidSim);
        jpaVacinal.add(jcbVacinaCovidNaoSabe);
        jpaVacinal.add(txtVacinaInfluenza);
        jpaVacinal.add(jcbVacinaInfluenzaNao);
        jpaVacinal.add(jcbVacinaInfluenzaSim);
        jpaVacinal.add(jcbVacinaInfluenzaNaoSabe);
        jpaVacinal.add(txtVacinaTetano);
        jpaVacinal.add(jcbVacinaTetanoNao);
        jpaVacinal.add(jcbVacinaTetanoSim);
        jpaVacinal.add(jcbVacinaTetanoNaoSabe);
        jpaVacinal.add(txtVacinaHepatite);
        jpaVacinal.add(jcbVacinaHepatiteNao);
        jpaVacinal.add(jcbVacinaHepatiteSim);
        jpaVacinal.add(jcbVacinaHepatiteNaoSabe);
        
        mainPanel.add(jpaVacinal);
        
        JPanel jpaEncaminhamentos = new JPanel(new GridLayout(13, 1, 5, 5));
        jpaEncaminhamentos.setBorder(BorderFactory.createTitledBorder("Encaminhamentos"));
        JLabel txtOfertarVacinas = new JLabel("Ofertar as vacinas disponiveis:");
        JCheckBox jcbNao = new JCheckBox("Não");
        JCheckBox jcbHepatiteB = new JCheckBox("Hepatite B");
        JCheckBox jcbNaoCovid19 = new JCheckBox("Covid-19");
        JCheckBox jcbInfluenza = new JCheckBox("Influenza");
        JCheckBox jcbFebreAmarela = new JCheckBox("Febre Amarela");
        JCheckBox jcbDuplaAdultoDT = new JCheckBox("Duplo Adulto(dT)");
        JCheckBox jcbTriplice = new JCheckBox("Triplice Viral(SRC)");
        JCheckBox jcbOutraVacina = new JCheckBox("Outra:");
        JTextField jtfOutraVacina = new JTextField(50);
        JLabel txtOfertarCarteiraVacinacao = new JLabel("Ofertar cópia da carteira de vacinação");
        JCheckBox jcbOfertarCarteiraVacinacaoSim = new JCheckBox("Sim");
        JCheckBox jcbOfertarCarteiraVacinacaoNao = new JCheckBox("Não");
        jpaEncaminhamentos.add(txtOfertarVacinas);
        jpaEncaminhamentos.add(jcbNao);
        jpaEncaminhamentos.add(jcbHepatiteB);
        jpaEncaminhamentos.add(jcbNaoCovid19);
        jpaEncaminhamentos.add(jcbInfluenza);
        jpaEncaminhamentos.add(jcbFebreAmarela);
        jpaEncaminhamentos.add(jcbDuplaAdultoDT);
        jpaEncaminhamentos.add(jcbTriplice);
        jpaEncaminhamentos.add(jcbOutraVacina);
        jpaEncaminhamentos.add(jtfOutraVacina);
        jpaEncaminhamentos.add(txtOfertarCarteiraVacinacao);
        jpaEncaminhamentos.add(jcbOfertarCarteiraVacinacaoSim);
        jpaEncaminhamentos.add(jcbOfertarCarteiraVacinacaoNao);
        mainPanel.add(jpaEncaminhamentos);
        
        JPanel jpaPriemiroAtendimentoClinico = new JPanel();
        jpaPriemiroAtendimentoClinico.setLayout(new BoxLayout(jpaPriemiroAtendimentoClinico, BoxLayout.Y_AXIS));
        jpaPriemiroAtendimentoClinico.setBorder(BorderFactory.createTitledBorder("Primeiro Atendimento Clínico"));
        JPanel jpaPACAntropometria = new JPanel(new GridLayout(3, 3, 5, 5));
        jpaPACAntropometria.setBorder(BorderFactory.createTitledBorder("Antroponetria"));
        JLabel txtPeso = new JLabel("Peso:");
        jtfPeso = new JTextField(10);
        JLabel txtKg = new JLabel("Kg");
        JLabel txtAltura = new JLabel("Altura:");
        jtfAltura = new JTextField(10);
        JLabel txtCm = new JLabel("cm");
        JLabel txtIMC = new JLabel("IMC:");
        jtfIMC = new JTextField(10);
        JLabel txtKGgMetrosQ = new JLabel("Kg/m2");
        jpaPACAntropometria.add(txtPeso);
        jpaPACAntropometria.add(jtfPeso);
        jpaPACAntropometria.add(txtKg);
        jpaPACAntropometria.add(txtAltura);
        jpaPACAntropometria.add(jtfAltura);
        jpaPACAntropometria.add(txtCm);
        jpaPACAntropometria.add(txtIMC);
        jpaPACAntropometria.add(jtfIMC);
        jpaPACAntropometria.add(txtKGgMetrosQ);
        jpaPriemiroAtendimentoClinico.add(jpaPACAntropometria);
        

        JPanel jpaPACSinaisVitais = new JPanel(new GridLayout(4, 3, 5, 5));
        jpaPACSinaisVitais.setBorder(BorderFactory.createTitledBorder("Sinais Vitais"));
        JLabel txtPa = new JLabel("PA:");
        jtfPa = new JTextField(10);
        JLabel txtmmhg = new JLabel("mmHg");
        JLabel txtFc = new JLabel("FC:");
        jtfFC = new JTextField(10);
        JLabel txtBpm = new JLabel("bpm");
        JLabel txtSat = new JLabel("SAT:");
        jtfSat = new JTextField(10);
        JLabel txtPorcentagem = new JLabel("%");
        JLabel txtTemp = new JLabel("Temp:");
        jtfTemp = new JTextField(10);
        JLabel txtGraus = new JLabel("ºC");
        jpaPACSinaisVitais.add(txtPa);
        jpaPACSinaisVitais.add(jtfPa);
        jpaPACSinaisVitais.add(txtmmhg);
        jpaPACSinaisVitais.add(txtFc);
        jpaPACSinaisVitais.add(jtfFC);
        jpaPACSinaisVitais.add(txtBpm);
        jpaPACSinaisVitais.add(txtSat);
        jpaPACSinaisVitais.add(jtfSat);
        jpaPACSinaisVitais.add(txtPorcentagem);
        jpaPACSinaisVitais.add(txtTemp);
        jpaPACSinaisVitais.add(jtfTemp);
        jpaPACSinaisVitais.add(txtGraus);
        jpaPriemiroAtendimentoClinico.add(jpaPACSinaisVitais);
        
        JPanel jpaPACSintomasRespiratorios = new JPanel(new GridLayout(10, 3, 5, 5));
        jpaPACSintomasRespiratorios.setBorder(BorderFactory.createTitledBorder("Apresenta Sintomas Respiratórios?"));
        JLabel txtTosse = new JLabel("Tosse");
        jcbTosseSim = new JCheckBox("Sim");
        jcbTosseNao = new JCheckBox("Não");
        JLabel txtCoriza = new JLabel("Coriza");
        jcbCorizaSim = new JCheckBox("Sim");
        jcbCorizaNao = new JCheckBox("Não");
        JLabel txtEspirros = new JLabel("Espirros");
        jcbEspirrosSim = new JCheckBox("Sim");
        jcbEspirrosNao = new JCheckBox("Não");
        JLabel txtFebre = new JLabel("Febre");
        jcbFebreSim = new JCheckBox("Sim");
        jcbFebreNao = new JCheckBox("Não");
        JLabel txtCalafrios = new JLabel("Calafrios");
        jcbCalafriosSim = new JCheckBox("Sim");
        jcbCalafriosNao = new JCheckBox("Não");
        JCheckBox jcbOutrosSintomas = new JCheckBox("Outros");
        jtfOutrosSintomas = new JTextField(20);
        JLabel txtespacoajuste2 = new JLabel("              ");
        JLabel txtespacoajuste3 = new JLabel("              ");
        JLabel txtespacoajuste4 = new JLabel("              ");
        JLabel txtDataInicioSintomas = new JLabel("Data de início dos sintomas:");
        jtfDataDeInicioSintomas = new JTextField(10);
        JLabel txtApresentaLesoes = new JLabel("Apresenta Lesões/ferimentos no corpo?:");
        jcbApresentaLesoesSim = new JCheckBox("Sim");
        jcbApresentaLesoesNao = new JCheckBox("Não");
        JLabel txtApresentaLesoesLocais = new JLabel("Local(is)?");
        jtfApresentaLesoesLocais = new JTextField(20);
        JLabel txtApresentaLesoesConduta = new JLabel("Conduta");
        jtfApresentaLesoesConduta = new JTextField(20);
        
        jpaPACSintomasRespiratorios.add(txtTosse);
        jpaPACSintomasRespiratorios.add(jcbTosseSim);
        jpaPACSintomasRespiratorios.add(jcbTosseNao);
        jpaPACSintomasRespiratorios.add(txtCoriza);
        jpaPACSintomasRespiratorios.add(jcbCorizaSim);
        jpaPACSintomasRespiratorios.add(jcbCorizaNao);
        jpaPACSintomasRespiratorios.add(txtEspirros);
        jpaPACSintomasRespiratorios.add(jcbEspirrosSim);
        jpaPACSintomasRespiratorios.add(jcbEspirrosNao);
        jpaPACSintomasRespiratorios.add(txtFebre);
        jpaPACSintomasRespiratorios.add(jcbFebreSim);
        jpaPACSintomasRespiratorios.add(jcbFebreNao);
        jpaPACSintomasRespiratorios.add(txtCalafrios);
        jpaPACSintomasRespiratorios.add(jcbCalafriosSim);
        jpaPACSintomasRespiratorios.add(jcbCalafriosNao);
        jpaPACSintomasRespiratorios.add(jcbOutrosSintomas);
        jpaPACSintomasRespiratorios.add(jtfOutrosSintomas);      
        jpaPACSintomasRespiratorios.add(txtespacoajuste2);
        jpaPACSintomasRespiratorios.add(txtDataInicioSintomas);
        jpaPACSintomasRespiratorios.add(jtfDataDeInicioSintomas);
        jpaPACSintomasRespiratorios.add(txtespacoajuste3);
        jpaPACSintomasRespiratorios.add(txtApresentaLesoes);
        jpaPACSintomasRespiratorios.add(jcbApresentaLesoesSim);
        jpaPACSintomasRespiratorios.add(jcbApresentaLesoesNao);
        
        jpaPACSintomasRespiratorios.add(txtApresentaLesoesLocais);
        jpaPACSintomasRespiratorios.add(jtfApresentaLesoesLocais);
        jpaPACSintomasRespiratorios.add(txtespacoajuste4);
        jpaPACSintomasRespiratorios.add(txtApresentaLesoesConduta);
        jpaPACSintomasRespiratorios.add(jtfApresentaLesoesConduta);
        jpaPriemiroAtendimentoClinico.add(jpaPACSintomasRespiratorios);
        
        mainPanel.add(jpaPriemiroAtendimentoClinico);
        
        JPanel jpaTestesRapidos = new JPanel();
        jpaTestesRapidos.setLayout(new BoxLayout(jpaTestesRapidos, BoxLayout.Y_AXIS));
        jpaTestesRapidos.setBorder(BorderFactory.createTitledBorder("Testes Rapidos"));
        
        JPanel jpaTestes = new JPanel(new GridLayout(6, 8 ,5, 5));
        jpaTestes.setBorder(BorderFactory.createTitledBorder("Testes"));
        JLabel txtHIV12 = new JLabel("HIV(1/2)");
        JLabel txtHIV12Lote = new JLabel("Lote:");
        jtfHIV12Lote = new JTextField(10);
        JLabel txtHIV12Validade = new JLabel("Validade:");
        jtfHIV12Validade = new JTextField(10);
        jcbHIV12R = new JCheckBox("R");
        jcbHIV12NR = new JCheckBox("NR");
        jcbHIV12NaoRealizado = new JCheckBox("Não Realizado");
        
        jpaTestes.add(txtHIV12);
        jpaTestes.add(txtHIV12Lote);
        jpaTestes.add(jtfHIV12Lote);
        jpaTestes.add(txtHIV12Validade);
        jpaTestes.add(jtfHIV12Validade);
        jpaTestes.add(jcbHIV12R);
        jpaTestes.add(jcbHIV12NR);
        jpaTestes.add(jcbHIV12NaoRealizado);

        JLabel txtHIV22 = new JLabel("HIV(2/2)");
        JLabel txtHIV22Lote = new JLabel("Lote:");
        jtfHIV22Lote = new JTextField(10);
        JLabel txtHIV22Validade = new JLabel("Validade:");
        jtfHIV22Validade = new JTextField(10);
        jcbHIV22R = new JCheckBox("R");
        jcbHIV22NR = new JCheckBox("NR");
        jcbHIV22NaoRealizado = new JCheckBox("Não Realizado");
        
        jpaTestes.add(txtHIV22);
        jpaTestes.add(txtHIV22Lote);
        jpaTestes.add(jtfHIV22Lote);
        jpaTestes.add(txtHIV22Validade);
        jpaTestes.add(jtfHIV22Validade);
        jpaTestes.add(jcbHIV22R);
        jpaTestes.add(jcbHIV22NR);
        jpaTestes.add(jcbHIV22NaoRealizado);
        
        JLabel txtSifilis = new JLabel("Sífilis)");
        JLabel txtSifilisLote = new JLabel("Lote:");
        jtfSifilisLote = new JTextField(10);
        JLabel txtSifilisValidade = new JLabel("Validade:");
        jtfSifilisValidade = new JTextField(10);
        jcbSifilisR = new JCheckBox("R");
        jcbSifilisNR = new JCheckBox("NR");
        jcbSifilisNaoRealizado = new JCheckBox("Não Realizado");
        
        jpaTestes.add(txtSifilis);
        jpaTestes.add(txtSifilisLote);
        jpaTestes.add(jtfSifilisLote);
        jpaTestes.add(txtSifilisValidade);
        jpaTestes.add(jtfSifilisValidade);
        jpaTestes.add(jcbSifilisR);
        jpaTestes.add(jcbSifilisNR);
        jpaTestes.add(jcbSifilisNaoRealizado);
        
        JLabel txtHepatiteB = new JLabel("Hepatite B)");
        JLabel txtHepatiteBLote = new JLabel("Lote:");
        jtfHepatiteBLote = new JTextField(10);
        JLabel txtHepatiteBValidade = new JLabel("Validade:");
        jtfHepatiteBValidade = new JTextField(10);
        jcbHepatiteBR = new JCheckBox("R");
        jcbHepatiteBNR = new JCheckBox("NR");
        jcbHepatiteBNaoRealizado = new JCheckBox("Não Realizado");
        
        jpaTestes.add(txtHepatiteB);
        jpaTestes.add(txtHepatiteBLote);
        jpaTestes.add(jtfHepatiteBLote);
        jpaTestes.add(txtHepatiteBValidade);
        jpaTestes.add(jtfHepatiteBValidade);
        jpaTestes.add(jcbHepatiteBR);
        jpaTestes.add(jcbHepatiteBNR);
        jpaTestes.add(jcbHepatiteBNaoRealizado);
        
        JLabel txtHepatiteC = new JLabel("Hepatite C)");
        JLabel txtHepatiteCLote = new JLabel("Lote:");
        jtfHepatiteCLote = new JTextField(10);
        JLabel txtHepatiteCValidade = new JLabel("Validade:");
        jtfHepatiteCValidade = new JTextField(10);
        jcbHepatiteCR = new JCheckBox("R");
        jcbHepatiteCNR = new JCheckBox("NR");
        jcbHepatiteCNaoRealizado = new JCheckBox("Não Realizado");
        
        jpaTestes.add(txtHepatiteC);
        jpaTestes.add(txtHepatiteCLote);
        jpaTestes.add(jtfHepatiteCLote);
        jpaTestes.add(txtHepatiteCValidade);
        jpaTestes.add(jtfHepatiteCValidade);
        jpaTestes.add(jcbHepatiteCR);
        jpaTestes.add(jcbHepatiteCNR);
        jpaTestes.add(jcbHepatiteCNaoRealizado);
        
        JLabel txtCovid = new JLabel("Covid)");
        JLabel txtCovidLote = new JLabel("Lote:");
        jtfCovidLote = new JTextField(10);
        JLabel txtCovidValidade = new JLabel("Validade:");
        jtfCovidValidade = new JTextField(10);
        jcbCovidR = new JCheckBox("R");
        jcbCovidNR = new JCheckBox("NR");
        jcbCovidNaoRealizado = new JCheckBox("Não Realizado");
        
        jpaTestes.add(txtCovid);
        jpaTestes.add(txtCovidLote);
        jpaTestes.add(jtfCovidLote);
        jpaTestes.add(txtCovidValidade);
        jpaTestes.add(jtfCovidValidade);
        jpaTestes.add(jcbCovidR);
        jpaTestes.add(jcbCovidNR);
        jpaTestes.add(jcbCovidNaoRealizado);
        
        jpaTestesRapidos.add(jpaTestes);
        
        JPanel jpaTesteGravidez = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel txtTesteGravidez = new JLabel("Teste de Gravidez");
        jcbTesteGravidezrSim = new JCheckBox("Sim");
        jcbTesteGravidezNao = new JCheckBox("Não");
        jcbTesteGravidezNaoRealizado = new JCheckBox("Não Realizado");
        jpaTesteGravidez.add(txtTesteGravidez);
        jpaTesteGravidez.add(jcbTesteGravidezrSim);
        jpaTesteGravidez.add(jcbTesteGravidezNao);
        jpaTesteGravidez.add(jcbTesteGravidezNaoRealizado);

        jpaTestesRapidos.add(jpaTesteGravidez);
        
        JPanel jpaAlgumaQueixa = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel txtAlgumaQueixa = new JLabel("Apresenta alguma outra queixa?");
        jcbAlgumaQueixaSim = new JCheckBox("Sim");
        jcbAlgumaQueixaNao = new JCheckBox("Não");
        JCheckBox jcbAlgumaQueixaQual = new JCheckBox("Qual(is):");
        jtfQueixa = new JTextField(20);
        JLabel txtConduta = new JLabel("Conduta?");
        jtfConduta = new JTextField(20);

        jpaAlgumaQueixa.add(txtAlgumaQueixa);
        jpaAlgumaQueixa.add(jcbAlgumaQueixaSim);
        jpaAlgumaQueixa.add(jcbAlgumaQueixaNao);
        jpaAlgumaQueixa.add(jcbAlgumaQueixaQual);
        jpaAlgumaQueixa.add(jtfQueixa);
        jpaAlgumaQueixa.add(txtConduta);
        jpaAlgumaQueixa.add(jtfConduta);

        jpaTestesRapidos.add(jpaAlgumaQueixa);
        
                
        JPanel jpaAlgumaQueixaOdontologica = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel txtAlgumaQueixaOdontologica = new JLabel("Apresenta alguma outra queixa Odontológica?");
        jcbAlgumaQueixaOdontologicaSim = new JCheckBox("Sim");
        jcbAlgumaQueixaOdontologicaNao = new JCheckBox("Não");
        JCheckBox jcbAlgumaQueixaOdontologicaQual = new JCheckBox("Qual(is):");
        jtfQueixaOdontologicaQual = new JTextField(20);
        JLabel txtNecessitaDentisaImediato = new JLabel("Necessita avaliação imediata de dentista:");
        jcbNecessitaDentisaImediatoSim = new JCheckBox("Sim");
        jcbNecessitaDentisaImediatoNao = new JCheckBox("Não");
        JLabel txtCondutaOdontologicaQual = new JLabel("Conduta?");
        jtfCondutaOdontologicaQual = new JTextField(20);

        jpaAlgumaQueixaOdontologica.add(txtAlgumaQueixaOdontologica);
        jpaAlgumaQueixaOdontologica.add(jcbAlgumaQueixaOdontologicaSim);
        jpaAlgumaQueixaOdontologica.add(jcbAlgumaQueixaOdontologicaNao);
        jpaAlgumaQueixaOdontologica.add(jcbAlgumaQueixaOdontologicaQual);
        jpaAlgumaQueixaOdontologica.add(jtfQueixaOdontologicaQual);
        jpaAlgumaQueixaOdontologica.add(txtNecessitaDentisaImediato);
        jpaAlgumaQueixaOdontologica.add(jcbNecessitaDentisaImediatoSim);
        jpaAlgumaQueixaOdontologica.add(jcbNecessitaDentisaImediatoNao);
        jpaAlgumaQueixaOdontologica.add(txtCondutaOdontologicaQual);
        jpaAlgumaQueixaOdontologica.add(jtfCondutaOdontologicaQual);

        jpaTestesRapidos.add(jpaAlgumaQueixaOdontologica);
        
        JPanel jpaEncaminhamentosFinais = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel txtEncaminhamentosFinais = new JLabel("Encaminhamentos finais:");
        jtfEncaminhamentosFinais = new JTextField(100);
        jpaEncaminhamentosFinais.add(txtEncaminhamentosFinais);
        jpaEncaminhamentosFinais.add(jtfEncaminhamentosFinais);
        
        jpaTestesRapidos.add(jpaEncaminhamentosFinais);
        
        mainPanel.add(jpaTestesRapidos);
        
        JPanel jpaBotao = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(evt -> btnSalvarEvent(evt));
        jpaBotao.add(btnSalvar);
        
        
        mainPanel.add(jpaBotao);
        
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane);
        
        bloquearComponentes(mainPanel);
        desbloquearComponentes(jpnAtendimento);
        desbloquearComponentes(jpaIdentificacao);
        btnCheck1.setEnabled(true);
    }
    
    private void btnSalvarEvent(ActionEvent evt) {
            // Escolaridade
            boolean escolaridadeFundamentalInc = rbFundamentalInc.isSelected();
            boolean escolaridadeFundamentalComp = rbFundamentalComp.isSelected();
            boolean escolaridadeMedioInc = rbMedioInc.isSelected();
            boolean escolaridadeMedioComp = rbMedioComp.isSelected();
            boolean escolaridadeSuperiorInc = rbSuperiorInc.isSelected();
            boolean escolaridadeSuperiorComp = rbSuperiorComp.isSelected();

            // Benefício
            boolean beneficioNao = rbBeneficioNao.isSelected();
            boolean beneficioSim = rbBeneficioSim.isSelected();
            String qualBeneficio = jtfQualBeneficio.getText();

            // Filhos
            boolean possuiFilhosNao = rbFilhosNao.isSelected();
            boolean possuiFilhosSim = rbFilhosSim.isSelected();
            String quantosFilhos = jtfQtdFilhos.getText();

            // Dependentes
            boolean outrosDependentesNao = rbDepNao.isSelected();
            boolean outrosDependentesSim = rbDepSim.isSelected();
            String quantosDependentes = jtfQtdDependentes.getText();

            // Idade
            String idadeSocial = jtfIdadeSocial.getText();

            // Encaminhamentos
            boolean encaminhamentoNEEJA = jcbEncaminhamentoNEEJA.isSelected();
            boolean assistSocial = jcbAssistSocial.isSelected();

            // ============ CONDIÇÕES DE SAÚDE ============
            // Deficiência
            boolean deficienciaNao = jcbDeficienciaNao.isSelected();
            boolean deficienciaSim = jcbDeficienciaSim.isSelected();
            String qualDeficiencia = jtfDeficiencia.getText();
            boolean deficienciaNaoSabe = jcbDeficienciaNaoSabe.isSelected();

            // Alergias
            boolean alergiasNao = jcbAlergiasNao.isSelected();
            boolean alergiasSim = jcbAlergiasSim.isSelected();
            String quaisAlergias = jtfAlergias.getText();
            boolean alergiasNaoSabe = jcbAlergiasNaoSabe.isSelected();

            // Cirurgias
            boolean cirurgiasNao = jcbCirurgiasNao.isSelected();
            boolean cirurgiasSim = jcbCirurgiasSim.isSelected();
            String quaisCirurgias = jtfCirurgias.getText();
            boolean cirurgiasNaoSabe = jcbCirurgiasNaoSabe.isSelected();

            // Condições crônicas
            boolean hipertensao = jcbHipertensao.isSelected();
            boolean diabetes = jcbDiabetes.isSelected();
            boolean hiv = jcbHIV.isSelected();

            // Doenças infecciosas
            boolean sifilis = jcbSifilis.isSelected();
            boolean hpv = jcbHPV.isSelected();
            boolean tuberculose = jcbTuberculose.isSelected();
            String cpf = jtfCpf.getText();
           
            // Doença de pele
            boolean doencaPeleNao = jcbPeleNao.isSelected();
            boolean doencaPeleSim = jcbPeleSim.isSelected();
            String qualDoencaPele = jtfPele.getText();

            // ============ SAÚDE COMPLEMENTAR ============
            // Autoimune
            boolean autoimuneNao = jcbAutoimuneNao.isSelected();
            boolean autoimuneSim = jcbAutoimuneSim.isSelected();
            String outraAutoimune = jtfAutoimuneOutra.getText();
            boolean autoimuneNaoSabe = jcbAutoimuneNaoSabe.isSelected();

            // Observações
            String obsAutoimune = jtfObsAutoimune.getText();
            String obsHepatite = jtfObsHepatite.getText();

            // Medicamento contínuo
            boolean medicamentoContinuoNao = jcbMedicamentoContinuoNao.isSelected();
            boolean medicamentoContinuoSim = jcbMedicamentoContinuoSim.isSelected();
            String quaisMedicamentos = jtfMedicamentos.getText();

            // Contato com enchente
            boolean contatoEnchenteNao = jcbEnchenteNao.isSelected();
            boolean contatoEnchenteSim = jcbEnchenteSim.isSelected();
            String anoEnchente = jtfAnoEnchente.getText();

            // Exposição
            String descreverExposicao = jtfExposicao.getText();

            // Tipo sanguíneo
            boolean tipoSanguineoAPos = jcbAPos.isSelected();
            boolean tipoSanguineoANeg = jcbANeg.isSelected();
            boolean tipoSanguineoBPos = jcbBPos.isSelected();
            boolean tipoSanguineoBNeg = jcbBNeg.isSelected();
            boolean tipoSanguineoOPos = jcbOPos.isSelected();
            boolean tipoSanguineoONeg = jcbONeg.isSelected();
            boolean tipoSanguineoABPos = jcbABPos.isSelected();
            boolean tipoSanguineoABNeg = jcbABNeg.isSelected();
            boolean tipoSanguineoNaoSabe = jcbNaoSabeTipoSanguineo.isSelected();

            // Encaminhamentos tipo sanguíneo
            String encaminhamentoSangue = jtfEncaminhamentoSangue.getText();

            // ============ SAÚDE DA MULHER ============
            // Gestação
            boolean gestacaoNaoSabe = jcbGestacaoNaoSabe.isSelected();
            boolean gestacaoNao = jcbGestacaoNao.isSelected();
            boolean gestacaoSim = jcbGestacaoSim.isSelected();
            String idadeGestacional = jtfIdadeGestacional.getText();

            // Método contraceptivo
            boolean contraceptivoNao = jcbContraceptivoNao.isSelected();
            boolean anticoncepcionalOral = jcbAnticoncepcionalOral.isSelected();
            boolean diuImplante = jcbDIUImplante.isSelected();
            boolean anticoncepcionalInjetavel = jcbAnticoncepcionalInjetavel.isSelected();
            boolean ligaduraTrompas = jcbLigaduraTrompas.isSelected();
            boolean histerectomia = jcbHisterectomia.isSelected();

            // Exame preventivo
            boolean preventivoNao = jcbPreventivoNao.isSelected();
            boolean preventivoSim = jcbPreventivoSim.isSelected();
            String anoPreventivo = jtfAnoPreventivo.getText();

            // Encaminhamentos Saúde da Mulher
            boolean ofertarContinuidadeContraceptivo = jcbOfertarContinuidadeContraceptivo.isSelected();
            boolean ofertarConsultaPreventivo = jcbOfertarConsultaPreventivo.isSelected();
            boolean encaminharPreNatalMulher = jcbEncaminharPreNatalMulher.isSelected();

            // ============ SAÚDE DO HOMEM ============
            // Exame de próstata
            boolean exameProstataNao = jcbExameProstataNao.isSelected();
            boolean exameProstataSim = jcbExameProstataSim.isSelected();
            String anoProstata = jtfAnoProstata.getText();

            // Histórico familiar
            boolean historicoProstataNao = jcbHistoricoProstataNao.isSelected();
            boolean historicoProstataSim = jcbHistoricoProstataSim.isSelected();
            String familiarProstata = jtfFamiliarProstata.getText();

            // Vasectomia
            boolean vasectomiaNao = jcbVasectomiaNao.isSelected();
            boolean vasectomiaSim = jcbVasectomiaSim.isSelected();

            // Parceira gestante
            boolean parceiraGestanteNao = jcbParceiraGestanteNao.isSelected();
            boolean parceiraGestanteSim = jcbParceiraGestanteSim.isSelected();
            boolean participandoPreNatalNao = jcbParticipandoPreNatalNao.isSelected();
            boolean participandoPreNatalSim = jcbParticipandoPreNatalSim.isSelected();

            // Encaminhamentos Saúde do Homem
            boolean ofertarVasectomia = jcbOfertarVasectomia.isSelected();
            boolean encaminharPreNatalParceiro = jcbEncaminharPreNatalParceiro.isSelected();

            // ============ SAÚDE MENTAL ============
            // CAPS
            boolean capsNao = jcbCapsNao.isSelected();
            boolean capsSim = jcbCapsSim.isSelected();
            String nomeMunicipioCaps = jtfCaps.getText();

            // Transtornos mentais
            boolean ansiedadeNao = jcbAnsiedadeNao.isSelected();
            boolean ansiedadeSim = jcbAnsiedadeSim.isSelected();
            boolean depressaoNao = jcbDepressaoNao.isSelected();
            boolean depressaoSim = jcbDepressaoSim.isSelected();
            boolean bipolaridadeNao = jcbBipolaridadeNao.isSelected();
            boolean bipolaridadeSim = jcbBipolaridadeSim.isSelected();
            boolean esquizofreniaNao = jcbEsquizofreniaNao.isSelected();
            boolean esquizofreniaSim = jcbEsquizofreniaSim.isSelected();
            boolean autismoNao = jcbAutismoNao.isSelected();
            boolean autismoSim = jcbAutismoSim.isSelected();
            String outroTranstorno = jtfOutroTranstorno.getText();
            boolean transtornoNaoSabe = jcbTranstornoNaoSabe.isSelected();

            // Medicamento controlado
            boolean medicamentoControladoNao = jcbMedicamentoControladoNao.isSelected();
            boolean medicamentoControladoSim = jcbMedicamentoControladoSim.isSelected();
            String qualMedicamentoControlado = jtfMedicamentoControlado.getText();
            boolean medicamentoControladoNaoSabe = jcbMedicamentoControladoNaoSabe.isSelected();

            // Acompanhamento prisão
            boolean acompanhamentoPrisaoNao = jcbAcompanhamentoPrisaoNao.isSelected();
            boolean acompanhamentoPrisaoSim = jcbAcompanhamentoPrisaoSim.isSelected();
            String motivoAcompanhamento = jtfMotivoAcomp.getText();

            // Uso de substâncias
            boolean usoAlcoolNao = jcbUsoAlcoolNao.isSelected();
            boolean usoAlcoolSim = jcbUsoAlcoolSim.isSelected();
            boolean usoCigarroNao = jcbUsoCigarroNao.isSelected();
            boolean usoCigarroSim = jcbUsoCigarroSim.isSelected();
            boolean usoMaconhaNao = jcbUsoMaconhaNao.isSelected();
            boolean usoMaconhaSim = jcbUsoMaconhaSim.isSelected();
            boolean usoCrackNao = jcbUsoCrackNao.isSelected();
            boolean usoCrackSim = jcbUsoCrackSim.isSelected();
            boolean usoCocainaNao = jcbUsoCocainaNao.isSelected();
            boolean usoCocainaSim = jcbUsoCocainaSim.isSelected();
            boolean usoAnfetaminasNao = jcbUsoAnfetaminasNao.isSelected();
            boolean usoAnfetaminasSim = jcbUsoAnfetaminasSim.isSelected();
            boolean usoDrogasKNao = jcbUsoDrogasKNao.isSelected();
            boolean usoDrogasKSim = jcbUsoDrogasKSim.isSelected();
            boolean usoOutrasSubstanciasNao = jcbUsoOutrasSubstanciasNao.isSelected();
            boolean usoOutrasSubstanciasSim = jcbUsoOutrasSubstanciasSim.isSelected();
            String outrasSubstancias = jtfOutrasSubstancias.getText();

            // Tratamento para cessar uso
            boolean tratamentoCessarNao = jcbTratamentoCessarNao.isSelected();
            boolean tratamentoCessarSim = jcbTratamentoCessarSim.isSelected();
            String substanciaTratamento = jtfSubstanciaTratamento.getText();

            // Deseja realizar tratamento
            boolean desejaTratamentoNao = jcbDesejaTratamentoNao.isSelected();
            boolean desejaTratamentoSim = jcbDesejaTratamentoSim.isSelected();
            String desejoSubstancia = jtfDesejoSubstancia.getText();

            // ============ ENCAMINHAMENTOS GERAIS ============
            boolean ofertarConsultaPsicologia = jcbOfertarConsultaPsicologia.isSelected();
            boolean ofertarConsultaPsiquiatria = jcbOfertarConsultaPsiquiatria.isSelected();
            boolean encaminharRenovacaoReceitas = jcbEncaminharRenovacaoReceitas.isSelected();
            boolean ofertarGruposApoio = jcbOfertarGruposApoio.isSelected();

            // ============ SITUAÇÃO VACINAL ============
            boolean vacinaCovidNao = jcbVacinaCovidNao.isSelected();
            boolean vacinaCovidSim = jcbVacinaCovidSim.isSelected();
            boolean vacinaCovidNaoSabe = jcbVacinaCovidNaoSabe.isSelected();
            boolean vacinaInfluenzaNao = jcbVacinaInfluenzaNao.isSelected();
            boolean vacinaInfluenzaSim = jcbVacinaInfluenzaSim.isSelected();
            boolean vacinaInfluenzaNaoSabe = jcbVacinaInfluenzaNaoSabe.isSelected();
            boolean vacinaTetanoNao = jcbVacinaTetanoNao.isSelected();
            boolean vacinaTetanoSim = jcbVacinaTetanoSim.isSelected();
            boolean vacinaTetanoNaoSabe = jcbVacinaTetanoNaoSabe.isSelected();
            boolean vacinaHepatiteNao = jcbVacinaHepatiteNao.isSelected();
            boolean vacinaHepatiteSim = jcbVacinaHepatiteSim.isSelected();
            boolean vacinaHepatiteNaoSabe = jcbVacinaHepatiteNaoSabe.isSelected();

            // ============ PRIMEIRO ATENDIMENTO CLÍNICO ============
            // Antropometria
            String peso = jtfPeso.getText();
            String altura = jtfAltura.getText();
            String imc = jtfIMC.getText();

            // Sinais vitais
            String pa = jtfPa.getText();
            String fc = jtfFC.getText();
            String sat = jtfSat.getText();
            String temp = jtfTemp.getText();

            // Sintomas respiratórios
            boolean tosseSim = jcbTosseSim.isSelected();
            boolean tosseNao = jcbTosseNao.isSelected();
            boolean corizaSim = jcbCorizaSim.isSelected();
            boolean corizaNao = jcbCorizaNao.isSelected();
            boolean espirrosSim = jcbEspirrosSim.isSelected();
            boolean espirrosNao = jcbEspirrosNao.isSelected();
            boolean febreSim = jcbFebreSim.isSelected();
            boolean febreNao = jcbFebreNao.isSelected();
            boolean calafriosSim = jcbCalafriosSim.isSelected();
            boolean calafriosNao = jcbCalafriosNao.isSelected();
            String outrosSintomas = jtfOutrosSintomas.getText();
            String dataInicioSintomas = jtfDataDeInicioSintomas.getText();

            // Lesões
            boolean apresentaLesoesSim = jcbApresentaLesoesSim.isSelected();
            boolean apresentaLesoesNao = jcbApresentaLesoesNao.isSelected();
            String apresentaLesoesLocais = jtfApresentaLesoesLocais.getText();
            String apresentaLesoesConduta = jtfApresentaLesoesConduta.getText();

            // ============ TESTES RÁPIDOS ============
            // HIV (1/2)
            String hiv12Lote = jtfHIV12Lote.getText();
            String hiv12Validade = jtfHIV12Validade.getText();
            boolean hiv12R = jcbHIV12R.isSelected();
            boolean hiv12NR = jcbHIV12NR.isSelected();
            boolean hiv12NaoRealizado = jcbHIV12NaoRealizado.isSelected();

            // HIV (2/2)
            String hiv22Lote = jtfHIV22Lote.getText();
            String hiv22Validade = jtfHIV22Validade.getText();
            boolean hiv22R = jcbHIV22R.isSelected();
            boolean hiv22NR = jcbHIV22NR.isSelected();
            boolean hiv22NaoRealizado = jcbHIV22NaoRealizado.isSelected();

            // Sífilis
            String sifilisLote = jtfSifilisLote.getText();
            String sifilisValidade = jtfSifilisValidade.getText();
            boolean sifilisR = jcbSifilisR.isSelected();
            boolean sifilisNR = jcbSifilisNR.isSelected();
            boolean sifilisNaoRealizado = jcbSifilisNaoRealizado.isSelected();

            // Hepatite B
            String hepatiteBLote = jtfHepatiteBLote.getText();
            String hepatiteBValidade = jtfHepatiteBValidade.getText();
            boolean hepatiteBR = jcbHepatiteBR.isSelected();
            boolean hepatiteBNR = jcbHepatiteBNR.isSelected();
            boolean hepatiteBNaoRealizado = jcbHepatiteBNaoRealizado.isSelected();

            // Hepatite C
            String hepatiteCLote = jtfHepatiteCLote.getText();
            String hepatiteCValidade = jtfHepatiteCValidade.getText();
            boolean hepatiteCR = jcbHepatiteCR.isSelected();
            boolean hepatiteCNR = jcbHepatiteCNR.isSelected();
            boolean hepatiteCNaoRealizado = jcbHepatiteCNaoRealizado.isSelected();

            // Covid
            String covidLote = jtfCovidLote.getText();
            String covidValidade = jtfCovidValidade.getText();
            boolean covidR = jcbCovidR.isSelected();
            boolean covidNR = jcbCovidNR.isSelected();
            boolean covidNaoRealizado = jcbCovidNaoRealizado.isSelected();

            // Teste de Gravidez
            boolean testeGravidezSim = jcbTesteGravidezrSim.isSelected();
            boolean testeGravidezNao = jcbTesteGravidezNao.isSelected();
            boolean testeGravidezNaoRealizado = jcbTesteGravidezNaoRealizado.isSelected();

            // Queixas
            boolean algumaQueixaSim = jcbAlgumaQueixaSim.isSelected();
            boolean algumaQueixaNao = jcbAlgumaQueixaNao.isSelected();
            String algumaQueixaQual = jtfQueixa.getText();
            String condutaQueixa = jtfConduta.getText();

            // Queixas Odontológicas
            boolean queixaOdontologicaSim = jcbAlgumaQueixaOdontologicaSim.isSelected();
            boolean queixaOdontologicaNao = jcbAlgumaQueixaOdontologicaNao.isSelected();
            String queixaOdontologicaQual = jtfQueixaOdontologicaQual.getText();
            boolean necessitaDentistaImediatoSim = jcbNecessitaDentisaImediatoSim.isSelected();
            boolean necessitaDentistaImediatoNao = jcbNecessitaDentisaImediatoNao.isSelected();
            String condutaOdontologica = jtfCondutaOdontologicaQual.getText();

            // Encaminhamentos finais
            String encaminhamentosFinais = jtfEncaminhamentosFinais.getText();
            
            // Chamar a função para salvar os dados
            
            
            process.salvarDados(escolaridadeFundamentalInc, escolaridadeFundamentalComp, escolaridadeMedioInc, escolaridadeMedioComp, escolaridadeSuperiorInc, escolaridadeSuperiorComp, beneficioNao, beneficioSim, qualBeneficio, possuiFilhosNao, possuiFilhosSim, quantosFilhos, outrosDependentesNao, outrosDependentesSim, quantosDependentes, idadeSocial, encaminhamentoNEEJA, assistSocial, deficienciaNao, deficienciaSim, qualDeficiencia, deficienciaNaoSabe, alergiasNao, alergiasSim, quaisAlergias, alergiasNaoSabe, cirurgiasNao, cirurgiasSim, quaisCirurgias, cirurgiasNaoSabe, hipertensao, diabetes, hiv, sifilis, hpv, tuberculose,  cpf);
            
            process.salvarDados2(doencaPeleNao, doencaPeleSim, qualDoencaPele, autoimuneNao, autoimuneSim, outraAutoimune, autoimuneNaoSabe, obsAutoimune, obsHepatite, medicamentoContinuoNao, medicamentoContinuoSim, quaisMedicamentos, contatoEnchenteNao, contatoEnchenteSim, anoEnchente, descreverExposicao, tipoSanguineoAPos, tipoSanguineoANeg, tipoSanguineoBPos, tipoSanguineoBNeg, tipoSanguineoOPos, tipoSanguineoONeg, tipoSanguineoABPos, tipoSanguineoABNeg, tipoSanguineoNaoSabe, encaminhamentoSangue, gestacaoNaoSabe, gestacaoNao, gestacaoSim, idadeGestacional, contraceptivoNao, anticoncepcionalOral, diuImplante, anticoncepcionalInjetavel, ligaduraTrompas, histerectomia, preventivoNao, preventivoSim, anoPreventivo, ofertarContinuidadeContraceptivo, ofertarConsultaPreventivo, encaminharPreNatalMulher, exameProstataNao, exameProstataSim, anoProstata, historicoProstataNao, historicoProstataSim, familiarProstata, vasectomiaNao, vasectomiaSim, parceiraGestanteNao, parceiraGestanteSim, participandoPreNatalNao, participandoPreNatalSim, ofertarVasectomia, encaminharPreNatalParceiro, capsNao, capsSim, nomeMunicipioCaps, ansiedadeNao, ansiedadeSim, depressaoNao, depressaoSim, bipolaridadeNao, bipolaridadeSim, esquizofreniaNao, esquizofreniaSim, autismoNao, autismoSim, outroTranstorno, transtornoNaoSabe, medicamentoControladoNao, medicamentoControladoSim, qualMedicamentoControlado, medicamentoControladoNaoSabe, acompanhamentoPrisaoNao, acompanhamentoPrisaoSim, motivoAcompanhamento, usoAlcoolNao, usoAlcoolSim, usoCigarroNao, usoCigarroSim, usoMaconhaNao, usoMaconhaSim, usoCrackNao, usoCrackSim, usoCocainaNao, usoCocainaSim, usoAnfetaminasNao, usoAnfetaminasSim, usoDrogasKNao, usoDrogasKSim, usoOutrasSubstanciasNao, usoOutrasSubstanciasSim, outrasSubstancias, tratamentoCessarNao, tratamentoCessarSim, substanciaTratamento, desejaTratamentoNao, desejaTratamentoSim, desejoSubstancia, ofertarConsultaPsicologia, ofertarConsultaPsiquiatria, encaminharRenovacaoReceitas, ofertarGruposApoio, vacinaCovidNao, vacinaCovidSim, vacinaCovidNaoSabe, vacinaInfluenzaNao, vacinaInfluenzaSim, vacinaInfluenzaNaoSabe, vacinaTetanoNao, vacinaTetanoSim, vacinaTetanoNaoSabe, vacinaHepatiteNao, vacinaHepatiteSim, vacinaHepatiteNaoSabe, peso, altura, imc,  pa, fc, sat, temp, tosseSim, tosseNao, corizaSim, corizaNao, espirrosSim, espirrosNao, febreSim, febreNao, calafriosSim, calafriosNao, outrosSintomas, dataInicioSintomas, apresentaLesoesSim, apresentaLesoesNao, apresentaLesoesLocais, apresentaLesoesConduta, hiv12Lote, hiv12Validade, hiv12R, hiv12NR, hiv12NaoRealizado, hiv22Lote, hiv22Validade, hiv22R, hiv22NR, hiv22NaoRealizado, sifilisLote, sifilisValidade, sifilisR, sifilisNR, sifilisNaoRealizado, hepatiteBLote, hepatiteBValidade, hepatiteBR, hepatiteBNR, hepatiteBNaoRealizado, hepatiteCLote, hepatiteCValidade, hepatiteCR, hepatiteCNR, hepatiteCNaoRealizado, covidLote, covidValidade, covidR, covidNR, covidNaoRealizado, testeGravidezSim, testeGravidezNao, testeGravidezNaoRealizado, algumaQueixaSim, algumaQueixaNao, algumaQueixaQual, condutaQueixa, queixaOdontologicaSim, queixaOdontologicaNao, queixaOdontologicaQual, necessitaDentistaImediatoSim, necessitaDentistaImediatoNao, condutaOdontologica, encaminhamentosFinais, cpf);
            
            process.carregarDadosTabela(model);
            
            dispose();
    }
    
    
    private void btncheck1event(ActionEvent evt) {
        // Dados iniciais
            java.lang.String responsavelAtendimento = jtfResponsavelAtendimento.getText();
            java.lang.String dataAtendimentovar = dataAtendimento.getText();
            boolean transferenciaUnidade = jcbTransferenciaUnidade.isSelected();
            String procedencia = jtfProcedencia.getText();

            // ============ IDENTIFICAÇÃO ============
            String nomeCompleto = jtfNomeCompleto.getText();
            String nomeSocial = jtfNomeSocial.getText();
            String dataNascimento = jtfDataNasc.getText();
            String idade = jtfIdade.getText();
            String cpf = jtfCpf.getText();

            // Nacionalidade
            boolean nacionalidadeBrasileiro = jcbBr.isSelected();
            boolean nacionalidadeNaturalizado = jcbNaturalizado.isSelected();
            boolean nacionalidadeEstrangeiro = jcbEstrangeiro.isSelected();
            String pais = jtfQualPais.getText();

            // Nome da mãe e Estado civil
            String nomeMae = jtfNomeDaMae.getText();
            boolean estadoCivilSolteiro = jcbSolteiro.isSelected();
            boolean estadoCivilCasado = jcbCasado.isSelected();
            boolean estadoCivilUniaoEstavel = jcbUniaoEstavel.isSelected();
            boolean estadoCivilOutro = jcOutroEstadoCivil.isSelected();
            String estadoCivilOutroTexto = jtfEstadoCivilOutro.getText();

            // Raça/Cor
            boolean racaBranco = jcbBranco.isSelected();
            boolean racaPreto = jcbPreto.isSelected();
            boolean racaPardo = jcbPardo.isSelected();
            boolean racaAmarelo = jcbAmarelo.isSelected();
            boolean racaIndigena = jcbIndigena.isSelected();
            String etnia = jtfQualEtinia.getText();

            // Sexo Biológico
            boolean sexoFeminino = jcbFeminino.isSelected();
            boolean sexoMasculino = jcbMasculino.isSelected();
            boolean sexoIntersexual = jcbIntersexual.isSelected();
            boolean sexoNaoInformar = jcbNDInformarSexo.isSelected();

            // Identidade de Gênero
            boolean identidadeGeneroHomem = jcbHomem.isSelected();
            boolean identidadeGeneroMulher = jcbMulher.isSelected();
            boolean identidadeGeneroHomemTrans = jcbHomemTrans.isSelected();
            boolean identidadeGeneroMulherTrans = jcbMulherTravesti.isSelected();
            boolean identidadeGeneroNaoBinario = jcbNaoBinario.isSelected();
            boolean identidadeGeneroNaoInformar = jcbNDInformarIdentGenero.isSelected();

            // Orientação Sexual
            boolean orientacaoSexualHetero = jcbHetero.isSelected();
            boolean orientacaoSexualHomo = jcbHomo.isSelected();
            boolean orientacaoSexualBi = jcbBi.isSelected();
            boolean orientacaoSexualOutra = jcbOutraOrientacao.isSelected();
            String orientacaoSexualOutraTexto = jtfOutraOrientacaoSexual.getText();
            boolean orientacaoSexualNaoInformar = jcbNDOrientacao.isSelected();
        process.adicionarPreso(responsavelAtendimento, dataAtendimentovar, transferenciaUnidade, procedencia,
        nomeCompleto, nomeSocial, dataNascimento, idade, cpf, nacionalidadeBrasileiro, nacionalidadeNaturalizado,
        nacionalidadeEstrangeiro, pais, nomeMae, estadoCivilSolteiro, estadoCivilCasado, estadoCivilUniaoEstavel, 
        estadoCivilOutro, estadoCivilOutroTexto, racaBranco, racaPreto, racaPardo, racaAmarelo, racaIndigena,
        etnia, sexoFeminino, sexoMasculino, sexoIntersexual, sexoNaoInformar, identidadeGeneroHomem, 
        identidadeGeneroMulher, identidadeGeneroHomemTrans, identidadeGeneroMulherTrans,
        identidadeGeneroNaoBinario, identidadeGeneroNaoInformar, orientacaoSexualHetero, orientacaoSexualHomo,
        orientacaoSexualBi, orientacaoSexualOutra, orientacaoSexualOutraTexto, orientacaoSexualNaoInformar);
        
        desbloquearComponentes(mainPanel);
        
    }
    
    
    
    public void bloquearComponentes(Container container) {
        for (Component c : container.getComponents()) {
            c.setEnabled(false);
            if (c instanceof Container) {
                bloquearComponentes((Container) c);
            }
        }
    }
     
    public void desbloquearComponentes(Container container) {
        for (Component c : container.getComponents()) {
            c.setEnabled(true);
            if (c instanceof Container) {
                desbloquearComponentes((Container) c);
            }
        }
    }
}