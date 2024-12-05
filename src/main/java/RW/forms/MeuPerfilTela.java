package RW.forms;

import RW.Tabbed.TabbedForm;
import RW.controller_dao.ConexaoController;
import java.awt.Image;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MeuPerfilTela extends TabbedForm {

    private FileInputStream fis;
    private int tamanho;
    private boolean fotoCarregada = false;

    public MeuPerfilTela() {
        initComponents();
    }

    private void carregarFoto() {
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecionar arquivo");
        jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens (*.PNG,*.JPG,*.JPEG)", "png", "jpg", "jpeg"));
        int resultado = jfc.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(jfc.getSelectedFile());
                tamanho = (int) jfc.getSelectedFile().length();
                Image foto = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(ImagemMudaLabel.getWidth(),
                        ImagemMudaLabel.getHeight(), Image.SCALE_SMOOTH);
                ImagemMudaLabel.setIcon(new ImageIcon(foto));
                ImagemMudaLabel.updateUI();
                fotoCarregada = true;
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    @SuppressWarnings("empty-statement")
    private int cadastrar() {
        ConexaoController cadastro = new ConexaoController();
        try {
            //int retorno = cadastro.cadastroMuda(this);
            //if (retorno > 0) {
            //    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            //} else {
            //    JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro.");
            //};

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro. Por favor, tente novamente em alguns instantes.\n Caso o erro persista acione o suporte.");
            Logger.getLogger(MeuPerfilTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private void buscar() {
        ConexaoController cadastro = new ConexaoController();
        try {
            //cadastro.buscaCadastroMuda(this);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro. Por favor, tente novamente em alguns instantes.\n Caso o erro persista acione o suporte.");
            Logger.getLogger(MeuPerfilTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void atualizar() {
        ConexaoController cadastro = new ConexaoController();
        try {
            //cadastro.atualizaMuda(this);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro. Por favor, tente novamente em alguns instantes.\n Caso o erro persista acione o suporte.");
            Logger.getLogger(MeuPerfilTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reset() {
        ImagemMudaLabel.setIcon(new ImageIcon(MeuPerfilTela.class.getResource("/imagens/camera (1).png")));
        NomeCientificoTextField.setText(null);
        NomeComercialTextField.setText(null);
        ValorTextField.setText(null);
        codigoLabel.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipalPanel = new javax.swing.JPanel();
        ImagemPanel = new javax.swing.JPanel();
        ImagemMudaLabel = new javax.swing.JLabel();
        ImagemLabel = new javax.swing.JLabel();
        CarregarImagemButton = new javax.swing.JButton();
        DadosPanel = new javax.swing.JPanel();
        ValorTextField = new javax.swing.JTextField();
        EstadoLabel = new javax.swing.JLabel();
        NomeCientificoLabel = new javax.swing.JLabel();
        NomeComercialTextField = new javax.swing.JTextField();
        NomeComercialLabel = new javax.swing.JLabel();
        ValorLabel = new javax.swing.JLabel();
        NomeCientificoTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        codigoTxtLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        NomeCientificoTextField1 = new javax.swing.JTextField();
        NomeCientificoTextField2 = new javax.swing.JTextField();
        EstadoLabel1 = new javax.swing.JLabel();
        codigoLabel1 = new javax.swing.JLabel();
        BotoesPanel = new javax.swing.JPanel();
        CadastrarMudaButton = new javax.swing.JButton();
        AtualizarMudaButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        SenhaPanel = new javax.swing.JPanel();
        EstadoLabel2 = new javax.swing.JLabel();
        NomeCientificoLabel1 = new javax.swing.JLabel();
        NomeComercialTextField1 = new javax.swing.JTextField();
        NomeComercialLabel1 = new javax.swing.JLabel();
        NomeCientificoTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NomeCientificoTextField4 = new javax.swing.JTextField();
        statusForcaSenha1 = new RW.components.StatusForcaSenha();
        FormasPagamentoPanel = new javax.swing.JPanel();
        DataVencimentoLabel = new javax.swing.JLabel();
        NomeCientificoLabel3 = new javax.swing.JLabel();
        NumeroCartaoTextField = new javax.swing.JTextField();
        NumeroCartaoLabel = new javax.swing.JLabel();
        DataVencimentoTextField = new javax.swing.JTextField();
        NomeTitularTextField = new javax.swing.JTextField();
        cvvTextField = new javax.swing.JTextField();
        CvvLabel = new javax.swing.JLabel();
        CpfTitularTextField = new javax.swing.JTextField();
        NomeCientificoLabel4 = new javax.swing.JLabel();
        TipoCartaoLabel = new javax.swing.JLabel();
        tipoCartaoComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        painelPrincipalPanel.setMaximumSize(new java.awt.Dimension(1024, 768));
        painelPrincipalPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        painelPrincipalPanel.setPreferredSize(new java.awt.Dimension(1024, 768));

        ImagemMudaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagemMudaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/camera (1).png"))); // NOI18N
        ImagemMudaLabel.setAlignmentY(0.0F);

        ImagemLabel.setText("Imagem do Perfil");

        CarregarImagemButton.setText("Anexar Imagem");
        CarregarImagemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarImagemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ImagemPanelLayout = new javax.swing.GroupLayout(ImagemPanel);
        ImagemPanel.setLayout(ImagemPanelLayout);
        ImagemPanelLayout.setHorizontalGroup(
            ImagemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ImagemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagemMudaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagemPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ImagemLabel)
                        .addGap(121, 121, 121))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagemPanelLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(CarregarImagemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        ImagemPanelLayout.setVerticalGroup(
            ImagemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagemPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ImagemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImagemMudaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CarregarImagemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        EstadoLabel.setText("Data de Nascimento");

        NomeCientificoLabel.setText("CPF");

        NomeComercialLabel.setText("Nome");

        ValorLabel.setText("Sexo");

        jLabel6.setText("Status");

        codigoTxtLabel.setText("Código");

        EstadoLabel1.setText("E-mail");

        javax.swing.GroupLayout DadosPanelLayout = new javax.swing.GroupLayout(DadosPanel);
        DadosPanel.setLayout(DadosPanelLayout);
        DadosPanelLayout.setHorizontalGroup(
            DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosPanelLayout.createSequentialGroup()
                .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DadosPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(EstadoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeCientificoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DadosPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DadosPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150))
                            .addGroup(DadosPanelLayout.createSequentialGroup()
                                .addComponent(NomeCientificoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomeCientificoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DadosPanelLayout.createSequentialGroup()
                                .addComponent(EstadoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomeCientificoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DadosPanelLayout.createSequentialGroup()
                                .addComponent(ValorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DadosPanelLayout.createSequentialGroup()
                                    .addComponent(codigoTxtLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(DadosPanelLayout.createSequentialGroup()
                                    .addComponent(NomeComercialLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NomeComercialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DadosPanelLayout.setVerticalGroup(
            DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoTxtLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeComercialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeComercialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCientificoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeCientificoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeCientificoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstadoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeCientificoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        CadastrarMudaButton.setText("Cadastrar");
        CadastrarMudaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarMudaButtonActionPerformed(evt);
            }
        });

        AtualizarMudaButton.setText("Atualizar");
        AtualizarMudaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarMudaButtonActionPerformed(evt);
            }
        });

        LimparButton.setText("Limpar");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoesPanelLayout = new javax.swing.GroupLayout(BotoesPanel);
        BotoesPanel.setLayout(BotoesPanelLayout);
        BotoesPanelLayout.setHorizontalGroup(
            BotoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LimparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CadastrarMudaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AtualizarMudaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BotoesPanelLayout.setVerticalGroup(
            BotoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarMudaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtualizarMudaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        EstadoLabel2.setText("Confirmação da senha");

        NomeCientificoLabel1.setText("Senha nova");

        NomeComercialLabel1.setText("Senha antiga");

        jLabel7.setText("Status");

        javax.swing.GroupLayout SenhaPanelLayout = new javax.swing.GroupLayout(SenhaPanel);
        SenhaPanel.setLayout(SenhaPanelLayout);
        SenhaPanelLayout.setHorizontalGroup(
            SenhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SenhaPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(SenhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SenhaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statusForcaSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(SenhaPanelLayout.createSequentialGroup()
                        .addComponent(NomeCientificoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeCientificoTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SenhaPanelLayout.createSequentialGroup()
                        .addComponent(EstadoLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeCientificoTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SenhaPanelLayout.createSequentialGroup()
                        .addComponent(NomeComercialLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeComercialTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        SenhaPanelLayout.setVerticalGroup(
            SenhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SenhaPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(SenhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeComercialTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeComercialLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SenhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCientificoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeCientificoTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SenhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstadoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeCientificoTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(SenhaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusForcaSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        DataVencimentoLabel.setText("Data de vencimento");

        NomeCientificoLabel3.setText("Nome do titular do cartão");

        NumeroCartaoLabel.setText("Número do cartão");

        CvvLabel.setText("CVV");

        NomeCientificoLabel4.setText("CPF do Titular");

        TipoCartaoLabel.setText("Tipo de cartão");

        tipoCartaoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Débito", "Crédito" }));

        javax.swing.GroupLayout FormasPagamentoPanelLayout = new javax.swing.GroupLayout(FormasPagamentoPanel);
        FormasPagamentoPanel.setLayout(FormasPagamentoPanelLayout);
        FormasPagamentoPanelLayout.setHorizontalGroup(
            FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormasPagamentoPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormasPagamentoPanelLayout.createSequentialGroup()
                        .addComponent(NomeCientificoLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeTitularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormasPagamentoPanelLayout.createSequentialGroup()
                        .addComponent(DataVencimentoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DataVencimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormasPagamentoPanelLayout.createSequentialGroup()
                        .addComponent(NumeroCartaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumeroCartaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormasPagamentoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormasPagamentoPanelLayout.createSequentialGroup()
                        .addComponent(CvvLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormasPagamentoPanelLayout.createSequentialGroup()
                        .addComponent(NomeCientificoLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CpfTitularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormasPagamentoPanelLayout.createSequentialGroup()
                        .addComponent(TipoCartaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoCartaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        FormasPagamentoPanelLayout.setVerticalGroup(
            FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormasPagamentoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroCartaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroCartaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCientificoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeTitularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataVencimentoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataVencimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CvvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCientificoLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpfTitularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(FormasPagamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TipoCartaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tipoCartaoComboBox))
                .addContainerGap())
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout painelPrincipalPanelLayout = new javax.swing.GroupLayout(painelPrincipalPanel);
        painelPrincipalPanel.setLayout(painelPrincipalPanelLayout);
        painelPrincipalPanelLayout.setHorizontalGroup(
            painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                .addGroup(painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(BotoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                                .addGroup(painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SenhaPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DadosPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FormasPagamentoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
                            .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                                        .addComponent(ImagemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSeparator2))))))
                .addGap(17, 17, 17))
        );
        painelPrincipalPanelLayout.setVerticalGroup(
            painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                .addGroup(painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ImagemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SenhaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3))
                    .addComponent(FormasPagamentoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparButtonActionPerformed
        reset();
    }//GEN-LAST:event_LimparButtonActionPerformed

    private void AtualizarMudaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarMudaButtonActionPerformed
        atualizar();
        reset();

    }//GEN-LAST:event_AtualizarMudaButtonActionPerformed

    // chama a ação do botão cadastrar
    private void CadastrarMudaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarMudaButtonActionPerformed
        cadastrar();
        reset();
    }//GEN-LAST:event_CadastrarMudaButtonActionPerformed

    private void CarregarImagemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarImagemButtonActionPerformed
        carregarFoto();
    }//GEN-LAST:event_CarregarImagemButtonActionPerformed

    public FileInputStream getFis() {
        return fis;
    }

    public void setFis(FileInputStream fis) {
        this.fis = fis;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

        public JTextField getNomeCientificoTextField() {
        return NomeCientificoTextField;
    }

    public void setNomeCientificoTextField(String nomeCientifico) {
        NomeCientificoTextField.setText(nomeCientifico);
    }

    public JTextField getNomeComercialTextField() {
        return NomeComercialTextField;
    }

    public void setNomeComercialTextField(String nomeComercial) {
        NomeComercialTextField.setText(nomeComercial);
    }

    public JTextField getValorTextField() {
        return ValorTextField;
    }

    public void setValorTextField(String valorMuda) {
        ValorTextField.setText(valorMuda);
    }

    public JLabel getImagemMudaLabel() {
        return ImagemMudaLabel;
    }

    public void setImagemMudaLabel(ImageIcon icon) {
        ImagemMudaLabel.setIcon(icon);
    }

    public int getCodigoLabel() {
        int codigo = Integer.parseInt(codigoLabel.getText());
        return codigo;
    }

    public void setCodigoLabel(String codigo) {
        codigoLabel.setText(codigo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarMudaButton;
    private javax.swing.JPanel BotoesPanel;
    private javax.swing.JButton CadastrarMudaButton;
    private javax.swing.JButton CarregarImagemButton;
    private javax.swing.JTextField CpfTitularTextField;
    private javax.swing.JLabel CvvLabel;
    private javax.swing.JPanel DadosPanel;
    private javax.swing.JLabel DataVencimentoLabel;
    private javax.swing.JTextField DataVencimentoTextField;
    private javax.swing.JLabel EstadoLabel;
    private javax.swing.JLabel EstadoLabel1;
    private javax.swing.JLabel EstadoLabel2;
    private javax.swing.JLabel EstadoLabel3;
    private javax.swing.JPanel FormasPagamentoPanel;
    private javax.swing.JLabel ImagemLabel;
    private javax.swing.JLabel ImagemMudaLabel;
    private javax.swing.JPanel ImagemPanel;
    private javax.swing.JButton LimparButton;
    private javax.swing.JLabel NomeCientificoLabel;
    private javax.swing.JLabel NomeCientificoLabel1;
    private javax.swing.JLabel NomeCientificoLabel2;
    private javax.swing.JLabel NomeCientificoLabel3;
    private javax.swing.JLabel NomeCientificoLabel4;
    private javax.swing.JTextField NomeCientificoTextField;
    private javax.swing.JTextField NomeCientificoTextField1;
    private javax.swing.JTextField NomeCientificoTextField2;
    private javax.swing.JTextField NomeCientificoTextField3;
    private javax.swing.JTextField NomeCientificoTextField4;
    private javax.swing.JTextField NomeCientificoTextField5;
    private javax.swing.JTextField NomeCientificoTextField6;
    private javax.swing.JLabel NomeComercialLabel;
    private javax.swing.JLabel NomeComercialLabel1;
    private javax.swing.JLabel NomeComercialLabel2;
    private javax.swing.JTextField NomeComercialTextField;
    private javax.swing.JTextField NomeComercialTextField1;
    private javax.swing.JTextField NomeComercialTextField2;
    private javax.swing.JTextField NomeTitularTextField;
    private javax.swing.JLabel NumeroCartaoLabel;
    private javax.swing.JTextField NumeroCartaoTextField;
    private javax.swing.JPanel SenhaPanel;
    private javax.swing.JPanel SenhaPanel1;
    private javax.swing.JLabel TipoCartaoLabel;
    private javax.swing.JLabel ValorLabel;
    private javax.swing.JTextField ValorTextField;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel codigoLabel1;
    private javax.swing.JLabel codigoTxtLabel;
    private javax.swing.JTextField cvvTextField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel painelPrincipalPanel;
    private RW.components.StatusForcaSenha statusForcaSenha1;
    private RW.components.StatusForcaSenha statusForcaSenha2;
    private javax.swing.JComboBox<String> tipoCartaoComboBox;
    // End of variables declaration//GEN-END:variables

}
