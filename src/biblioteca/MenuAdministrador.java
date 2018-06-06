package biblioteca;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import libreria.*;
public class MenuAdministrador extends javax.swing.JFrame {
    
    
    OperacionDb operacion=new OperacionDb();
    DecimalFormat formato=new DecimalFormat("###,###.##");
    public MenuAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        cerrarPanels();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panellibro = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        btnmtodo = new javax.swing.JButton();
        lblopcion = new javax.swing.JLabel();
        panelautores = new javax.swing.JPanel();
        lbltitulo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcodigoau = new javax.swing.JTextField();
        btnbuscaraut = new javax.swing.JButton();
        btnagregaraut = new javax.swing.JButton();
        btncerraraut = new javax.swing.JButton();
        btnmtodoaut = new javax.swing.JButton();
        lblopcion1 = new javax.swing.JLabel();
        paneldetalles = new javax.swing.JPanel();
        lbltitulo2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigodet = new javax.swing.JTextField();
        btnbuscardet = new javax.swing.JButton();
        btnagregardet = new javax.swing.JButton();
        btncerrardet = new javax.swing.JButton();
        btnmtododet = new javax.swing.JButton();
        lblopcion2 = new javax.swing.JLabel();
        paneldist = new javax.swing.JPanel();
        lbltitulo3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcoddist = new javax.swing.JTextField();
        btnbuscardist = new javax.swing.JButton();
        btnagregardist = new javax.swing.JButton();
        btncerrardist = new javax.swing.JButton();
        btnmtododist = new javax.swing.JButton();
        lblopcion3 = new javax.swing.JLabel();
        paneltran = new javax.swing.JPanel();
        lbltitulo4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        btnbuscartran = new javax.swing.JButton();
        btnagregartran = new javax.swing.JButton();
        btncerrartran = new javax.swing.JButton();
        btnmtodotran = new javax.swing.JButton();
        lblopcion4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        libros = new javax.swing.JMenu();
        menulibro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuautor = new javax.swing.JMenuItem();
        menueditorial = new javax.swing.JMenuItem();
        menucategoria = new javax.swing.JMenuItem();
        menuidioma = new javax.swing.JMenuItem();
        menuestado = new javax.swing.JMenuItem();
        menudist = new javax.swing.JMenu();
        distribuidores = new javax.swing.JMenuItem();
        facturas = new javax.swing.JMenu();
        menuventas = new javax.swing.JMenuItem();
        compra = new javax.swing.JMenu();
        menumetpag = new javax.swing.JMenuItem();
        menucompra = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 102));

        panellibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panellibroFocusLost(evt);
            }
        });

        lbltitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbltitulo.setText("Operaciones:");

        jLabel2.setText("Código");

        txtcodigo.setText(" ");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btnmtodo.setText("Mostrar todo");
        btnmtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmtodoActionPerformed(evt);
            }
        });

        lblopcion.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout panellibroLayout = new javax.swing.GroupLayout(panellibro);
        panellibro.setLayout(panellibroLayout);
        panellibroLayout.setHorizontalGroup(
            panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellibroLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panellibroLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panellibroLayout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnmtodo)
                                .addGap(18, 18, 18)
                                .addComponent(btncerrar))
                            .addGroup(panellibroLayout.createSequentialGroup()
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panellibroLayout.createSequentialGroup()
                        .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panellibroLayout.setVerticalGroup(
            panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellibroLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscar))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btnmtodo)
                    .addComponent(btncerrar))
                .addGap(94, 94, 94))
        );

        lbltitulo1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbltitulo1.setText("Operaciones:");

        jLabel3.setText("Código");

        txtcodigoau.setText(" ");
        txtcodigoau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoauActionPerformed(evt);
            }
        });

        btnbuscaraut.setText("Buscar");
        btnbuscaraut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarautActionPerformed(evt);
            }
        });

        btnagregaraut.setText("Agregar");
        btnagregaraut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarautActionPerformed(evt);
            }
        });

        btncerraraut.setText("Cerrar");
        btncerraraut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarautActionPerformed(evt);
            }
        });

        btnmtodoaut.setText("Mostrar todo");
        btnmtodoaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmtodoautActionPerformed(evt);
            }
        });

        lblopcion1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout panelautoresLayout = new javax.swing.GroupLayout(panelautores);
        panelautores.setLayout(panelautoresLayout);
        panelautoresLayout.setHorizontalGroup(
            panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelautoresLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelautoresLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelautoresLayout.createSequentialGroup()
                                .addComponent(btnagregaraut)
                                .addGap(18, 18, 18)
                                .addComponent(btnmtodoaut)
                                .addGap(18, 18, 18)
                                .addComponent(btncerraraut))
                            .addGroup(panelautoresLayout.createSequentialGroup()
                                .addComponent(txtcodigoau, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscaraut))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelautoresLayout.createSequentialGroup()
                        .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblopcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelautoresLayout.setVerticalGroup(
            panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelautoresLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblopcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodigoau, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscaraut))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregaraut)
                    .addComponent(btnmtodoaut)
                    .addComponent(btncerraraut))
                .addGap(94, 94, 94))
        );

        lbltitulo2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbltitulo2.setText("Operaciones:");

        jLabel4.setText("Código");

        txtcodigodet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigodetActionPerformed(evt);
            }
        });

        btnbuscardet.setText("Buscar");
        btnbuscardet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscardetActionPerformed(evt);
            }
        });

        btnagregardet.setText("Agregar");
        btnagregardet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregardetActionPerformed(evt);
            }
        });

        btncerrardet.setText("Cerrar");
        btncerrardet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrardetActionPerformed(evt);
            }
        });

        btnmtododet.setText("Mostrar todo");
        btnmtododet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmtododetActionPerformed(evt);
            }
        });

        lblopcion2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout paneldetallesLayout = new javax.swing.GroupLayout(paneldetalles);
        paneldetalles.setLayout(paneldetallesLayout);
        paneldetallesLayout.setHorizontalGroup(
            paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetallesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneldetallesLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneldetallesLayout.createSequentialGroup()
                                .addComponent(btnagregardet)
                                .addGap(18, 18, 18)
                                .addComponent(btnmtododet)
                                .addGap(18, 18, 18)
                                .addComponent(btncerrardet))
                            .addGroup(paneldetallesLayout.createSequentialGroup()
                                .addComponent(txtcodigodet, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscardet))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneldetallesLayout.createSequentialGroup()
                        .addComponent(lbltitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblopcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        paneldetallesLayout.setVerticalGroup(
            paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetallesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblopcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodigodet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscardet))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregardet)
                    .addComponent(btnmtododet)
                    .addComponent(btncerrardet))
                .addGap(94, 94, 94))
        );

        paneldist.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                paneldistFocusLost(evt);
            }
        });

        lbltitulo3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbltitulo3.setText("Operaciones:");

        jLabel5.setText("Código");

        txtcoddist.setText(" ");

        btnbuscardist.setText("Buscar");
        btnbuscardist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscardistActionPerformed(evt);
            }
        });

        btnagregardist.setText("Agregar");
        btnagregardist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregardistActionPerformed(evt);
            }
        });

        btncerrardist.setText("Cerrar");
        btncerrardist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrardistActionPerformed(evt);
            }
        });

        btnmtododist.setText("Mostrar todo");
        btnmtododist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmtododistActionPerformed(evt);
            }
        });

        lblopcion3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout paneldistLayout = new javax.swing.GroupLayout(paneldist);
        paneldist.setLayout(paneldistLayout);
        paneldistLayout.setHorizontalGroup(
            paneldistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldistLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(paneldistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneldistLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneldistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneldistLayout.createSequentialGroup()
                                .addComponent(btnagregardist)
                                .addGap(18, 18, 18)
                                .addComponent(btnmtododist)
                                .addGap(18, 18, 18)
                                .addComponent(btncerrardist))
                            .addGroup(paneldistLayout.createSequentialGroup()
                                .addComponent(txtcoddist, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscardist))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneldistLayout.createSequentialGroup()
                        .addComponent(lbltitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblopcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        paneldistLayout.setVerticalGroup(
            paneldistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldistLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(paneldistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblopcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(paneldistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcoddist, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscardist))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(paneldistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregardist)
                    .addComponent(btnmtododist)
                    .addComponent(btncerrardist))
                .addGap(94, 94, 94))
        );

        lbltitulo4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbltitulo4.setText("Operaciones:");

        jLabel6.setText("Código");

        txtfolio.setText(" ");
        txtfolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfolioActionPerformed(evt);
            }
        });

        btnbuscartran.setText("Buscar");
        btnbuscartran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscartranActionPerformed(evt);
            }
        });

        btnagregartran.setText("Agregar");
        btnagregartran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregartranActionPerformed(evt);
            }
        });

        btncerrartran.setText("Cerrar");
        btncerrartran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrartranActionPerformed(evt);
            }
        });

        btnmtodotran.setText("Mostrar todo");
        btnmtodotran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmtodotranActionPerformed(evt);
            }
        });

        lblopcion4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout paneltranLayout = new javax.swing.GroupLayout(paneltran);
        paneltran.setLayout(paneltranLayout);
        paneltranLayout.setHorizontalGroup(
            paneltranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltranLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(paneltranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneltranLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneltranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneltranLayout.createSequentialGroup()
                                .addComponent(btnagregartran)
                                .addGap(18, 18, 18)
                                .addComponent(btnmtodotran)
                                .addGap(18, 18, 18)
                                .addComponent(btncerrartran))
                            .addGroup(paneltranLayout.createSequentialGroup()
                                .addComponent(txtfolio, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscartran))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneltranLayout.createSequentialGroup()
                        .addComponent(lbltitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblopcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        paneltranLayout.setVerticalGroup(
            paneltranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltranLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(paneltranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblopcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(paneltranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfolio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscartran))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(paneltranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregartran)
                    .addComponent(btnmtodotran)
                    .addComponent(btncerrartran))
                .addGap(94, 94, 94))
        );

        jMenuBar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMenuBar1FocusGained(evt);
            }
        });

        libros.setText("Libros");
        libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librosActionPerformed(evt);
            }
        });

        menulibro.setText("Libros");
        menulibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulibroActionPerformed(evt);
            }
        });
        libros.add(menulibro);

        jMenu6.setText("Detalles");

        menuautor.setText("Autor");
        menuautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuautorActionPerformed(evt);
            }
        });
        jMenu6.add(menuautor);

        menueditorial.setText("Editorial");
        menueditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menueditorialActionPerformed(evt);
            }
        });
        jMenu6.add(menueditorial);

        menucategoria.setText("Categoría");
        menucategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucategoriaActionPerformed(evt);
            }
        });
        jMenu6.add(menucategoria);

        menuidioma.setText("Idioma");
        menuidioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuidiomaActionPerformed(evt);
            }
        });
        jMenu6.add(menuidioma);

        menuestado.setText("Estado");
        menuestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuestadoActionPerformed(evt);
            }
        });
        jMenu6.add(menuestado);

        libros.add(jMenu6);

        jMenuBar1.add(libros);

        menudist.setText("Distribuidores");
        menudist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudistActionPerformed(evt);
            }
        });

        distribuidores.setText("Distribuidores");
        distribuidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distribuidoresActionPerformed(evt);
            }
        });
        menudist.add(distribuidores);

        jMenuBar1.add(menudist);

        facturas.setText("Gestión Facturas");

        menuventas.setText("Facturas");
        menuventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuventasActionPerformed(evt);
            }
        });
        facturas.add(menuventas);

        jMenuBar1.add(facturas);

        compra.setText("Gestión Compra");

        menumetpag.setText("MetodoPago");
        menumetpag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menumetpagActionPerformed(evt);
            }
        });
        compra.add(menumetpag);

        menucompra.setText("GestionCompra");
        menucompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucompraActionPerformed(evt);
            }
        });
        compra.add(menucompra);

        jMenuBar1.add(compra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panellibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelautores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paneldetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paneldist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paneltran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panellibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelautores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paneldetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paneldist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(paneltran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void cerrarPanels(){
        panelautores.setVisible(false);
        paneldetalles.setVisible(false);
        paneldist.setVisible(false);
        panellibro.setVisible(false);
        paneltran.setVisible(false);
    }
    private void menulibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulibroActionPerformed
        //        this.setEnabled(false);
        //        Operaciones o=new Operaciones(this,"operaciones");
        //        o.lbltitulo.setText("Operaciones Libros");
        //        o.setVisible(true);
        //        Libros.getText(); codigo para crear nuevo frame, inhabilitando el anterior.
        cerrarPanels();
        panellibro.setVisible(true);
        lblopcion.setText(menulibro.getText());

    }//GEN-LAST:event_menulibroActionPerformed

    private void menuautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuautorActionPerformed
        cerrarPanels();
        panelautores.setVisible(true);
        lblopcion1.setText(menuautor.getText());
    }//GEN-LAST:event_menuautorActionPerformed

    private void menueditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menueditorialActionPerformed
        cerrarPanels();
        paneldetalles.setVisible(true);
        lblopcion2.setText(menueditorial.getText());
    }//GEN-LAST:event_menueditorialActionPerformed

    private void menucategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucategoriaActionPerformed
        cerrarPanels();
        paneldetalles.setVisible(true);
        lblopcion2.setText(menucategoria.getText());
    }//GEN-LAST:event_menucategoriaActionPerformed

    private void menuidiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuidiomaActionPerformed
        cerrarPanels();
        paneldetalles.setVisible(true);
        lblopcion2.setText(menuidioma.getText());
    }//GEN-LAST:event_menuidiomaActionPerformed

    private void menuestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuestadoActionPerformed
        cerrarPanels();
        paneldetalles.setVisible(true);
        lblopcion2.setText(menuestado.getText());
    }//GEN-LAST:event_menuestadoActionPerformed

    private void librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosActionPerformed

    }//GEN-LAST:event_librosActionPerformed

    private void distribuidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distribuidoresActionPerformed
        cerrarPanels();
        paneldist.setVisible(true);
        lblopcion3.setText(menudist.getText());
    }//GEN-LAST:event_distribuidoresActionPerformed

    private void menudistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudistActionPerformed

    }//GEN-LAST:event_menudistActionPerformed

    private void menuventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuventasActionPerformed
        cerrarPanels();
        paneltran.setVisible(true);
        lblopcion4.setText(menuventas.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_menuventasActionPerformed

    private void menumetpagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumetpagActionPerformed

        cerrarPanels();
        paneldetalles.setVisible(true);
        lblopcion2.setText(menumetpag.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_menumetpagActionPerformed

    private void menucompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucompraActionPerformed

        cerrarPanels();
        paneltran.setVisible(true);
        lblopcion4.setText(menucompra.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_menucompraActionPerformed

    private void jMenuBar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenuBar1FocusGained

    }//GEN-LAST:event_jMenuBar1FocusGained

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        LibroCompleto libroc=null;
        Operar op=new Operar();
        libroc=operacion.buscarLibro(txtcodigo.getText());
        if(libroc!=null){
            op.setTxtnumserie(String.valueOf(libroc.getSerie()));
            op.setTxtisbn(String.valueOf(libroc.getCodisbn()));
            op.setTxttitulo(libroc.getTitulo());
            op.setTxtnumpag(String.valueOf(libroc.getNumpag()));
            op.setTxtprecio(String.valueOf(libroc.getPrecio()));
            op.setTxtaño(libroc.getAño());
            op.setTxtestado(libroc.getEstado());
            op.setTxteditorial(libroc.getEditorial());
            op.setcategorias(libroc.getCategorias());
            op.setidiomas(libroc.getIdiomas());
            op.setautores(libroc.getAutores());
            op.dissIsbn(true);
            op.dissbtnagregar();
            op.setVisible(true);
        }else{
            System.out.println("Libro no existe");
        }

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        Operar op=new Operar();
        op.setVisible(true);
        op.dissme();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed

        panellibro.setVisible(false);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnmtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmtodoActionPerformed

        llenarTablalibros(operacion.mostrarTodo());
        operacion.setAlist();
    }//GEN-LAST:event_btnmtodoActionPerformed

    private void panellibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panellibroFocusLost

    }//GEN-LAST:event_panellibroFocusLost

    private void txtcodigoauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoauActionPerformed

    private void btnbuscarautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarautActionPerformed

        if(!txtcodigoau.getText().equals(" ")){
            Autores a=operacion.buscarAutor(txtcodigoau.getText());
            if(a!=null){
                OperarDetalles od=new OperarDetalles();
                od.dissTxt();
                od.setVisible(true);
                od.setLocationRelativeTo(null);
                od.dissagregar();
                od.setBuscar(String.valueOf(a.getCodaut()), a.getNombre(), a.getApp(), a.getApm());
            }else{
                System.out.println("No existe");
            }
        }else{
            System.out.println("txt nulo");
        }
    }//GEN-LAST:event_btnbuscarautActionPerformed

    private void btnagregarautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarautActionPerformed

        OperarDetalles od=new OperarDetalles();
        od.setVisible(true);
        od.setLocationRelativeTo(null);
        od.dissme();
        od.dissCodaut();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarautActionPerformed

    private void btncerrarautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarautActionPerformed
        panelautores.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrarautActionPerformed

    private void btnmtodoautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmtodoautActionPerformed

        llenarTablaaut(operacion.mostrarTodoaut());
        operacion.setAulist();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmtodoautActionPerformed

    private void txtcodigodetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigodetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigodetActionPerformed

    private void btnbuscardetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscardetActionPerformed
        Detalle d;
        OperarDm opdm=new OperarDm();
        if(!txtcodigodet.getText().isEmpty()){
        switch(lblopcion2.getText()){

            case "Idioma":  d=operacion.buscarDetalle("IDIOMA",txtcodigodet.getText());
            opdm.dissAgregar();if(d!=null){opdm.setBuscar(String.valueOf(d.getCodigo()), d.getNombre());}
                else{opdm.clearTxt();}
            opdm.setLbltitulo("IDIOMA");opdm.blockCodigo();
            opdm.setVisible(true);opdm.setLocationRelativeTo(null);break;
            case "Editorial": d=operacion.buscarDetalle("EDITORIAL",txtcodigodet.getText());
            opdm.dissAgregar();if(d!=null){opdm.setBuscar(String.valueOf(d.getCodigo()), d.getNombre());}
                else{opdm.clearTxt();}
            opdm.setLbltitulo(lblopcion2.getText());opdm.blockCodigo();
            opdm.setVisible(true);opdm.setLocationRelativeTo(null);break;
            case "Categoría": d=operacion.buscarDetalle("CATEGORIA",txtcodigodet.getText());
            opdm.dissAgregar();if(d!=null){opdm.setBuscar(String.valueOf(d.getCodigo()), d.getNombre());}
            else{opdm.clearTxt();}
            opdm.setLbltitulo("CATEGORIA");opdm.blockCodigo();
            opdm.setVisible(true);opdm.setLocationRelativeTo(null);break;
            case "Estado": d=operacion.buscarDetalle("ESTADO",txtcodigodet.getText());
            opdm.dissAgregar();if(d!=null){opdm.setBuscar(String.valueOf(d.getCodigo()), d.getNombre());}
            else{opdm.clearTxt();}
            opdm.setLbltitulo("ESTADO");opdm.blockCodigo();
            opdm.setVisible(true);opdm.setLocationRelativeTo(null);break;
            case "MetodoPago": d=operacion.buscarDetalle("METODO_PAGO",txtcodigodet.getText());
            opdm.dissAgregar();if(d!=null){opdm.setBuscar(String.valueOf(d.getCodigo()), d.getNombre());}
            else{opdm.clearTxt();}
            opdm.setLbltitulo("METODO_PAGO");opdm.blockCodigo();
            opdm.setVisible(true);opdm.setLocationRelativeTo(null);break;
        }
        }
    }//GEN-LAST:event_btnbuscardetActionPerformed

    private void btnagregardetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregardetActionPerformed

        OperarDm opdm=new OperarDm();
        switch(lblopcion2.getText()){
            
            case "Idioma": opdm.dissMe();opdm.setVisible(true);opdm.setLocationRelativeTo(null);
            opdm.setLbltitulo("IDIOMA");break;
            case "Editorial": opdm.dissMe();opdm.setVisible(true);opdm.setLocationRelativeTo(null);
            opdm.setLbltitulo("EDITORIAL");break;
            case "Categoría": opdm.dissMe();opdm.setVisible(true);opdm.setLocationRelativeTo(null);
            opdm.setLbltitulo("CATEGORIA");break;
            case "Estado": opdm.dissMe();opdm.setVisible(true);opdm.setLocationRelativeTo(null);
            opdm.setLbltitulo("ESTADO");break;
            case "MetodoPago":opdm.dissMe();opdm.setVisible(true);opdm.setLocationRelativeTo(null);
            opdm.setLbltitulo("METODO_PAGO");break;
        }
        opdm.dissCodigo();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregardetActionPerformed

    private void btncerrardetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrardetActionPerformed
        paneldetalles.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_btncerrardetActionPerformed

    private void btnmtododetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmtododetActionPerformed

        switch(lblopcion2.getText().toUpperCase()){

            case "IDIOMA":  llenarTabladet(operacion.mostrarTododet("IDIOMA"));operacion.setDetlist();break;
            case "EDITORIAL":   llenarTabladet(operacion.mostrarTododet("EDITORIAL"));operacion.setDetlist();break;
            case "CATEGORÍA":   llenarTabladet(operacion.mostrarTododet("CATEGORIA"));operacion.setDetlist();break;
            case "ESTADO":  llenarTabladet(operacion.mostrarTododet("ESTADO"));operacion.setDetlist();break;
            case "METODOPAGO": llenarTabladet(operacion.mostrarTododet("METODO_PAGO"));operacion.setDetlist();break;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmtododetActionPerformed

    private void btnbuscardistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscardistActionPerformed

        if(!txtcoddist.getText().equals(" ")){
            Distribuidores d=operacion.buscarDist(txtcoddist.getText());
            OperarDist od=new OperarDist();
            if(d!=null){
                od.setVisible(true);
                od.setLocationRelativeTo(null);
                od.dissAgregar();
                od.setBuscar(d.getRutd(),d.getNombre(),d.getCalle(),d.getNumcalle(),d.getComuna(),d.getPais(),d.getFono(),d.getAño());
            }else{
                System.out.println("No existe");
                od.clearTxt();
            }
        }else{
            System.out.println("txt nulo");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscardistActionPerformed

    private void btnagregardistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregardistActionPerformed

        OperarDist op=new OperarDist();
        op.setVisible(true);
        op.setLocationRelativeTo(null);
        op.dissMe();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregardistActionPerformed

    private void btncerrardistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrardistActionPerformed

        paneldist.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrardistActionPerformed

    private void btnmtododistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmtododistActionPerformed

        llenarTabladist(operacion.mostrarTodoDist());
        operacion.setDistlist();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnmtododistActionPerformed

    private void paneldistFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paneldistFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_paneldistFocusLost

    private void txtfolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfolioActionPerformed

    private void btnbuscartranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscartranActionPerformed

        if(lblopcion4.getText().equals("Facturas")){
            if(!txtfolio.getText().isEmpty()){
                Venta v = operacion.buscarVenta(txtfolio.getText());
                if(v!=null){
                    Transaccion tr = new Transaccion(true);
                    tr.addTrabajador();
                    tr.rellar(v.getFoliov(), v.getRutt(), v.getRutc(), v.getFecha(), v.getCodtp());
                    tr.dissAgregar();
                    tr.setVisible(true);
                    tr.setLocationRelativeTo(null);}
                else{   System.out.println("No hay objeto");}
            }
        }else{
            if(!txtfolio.getText().isEmpty()){
                Compra c = operacion.buscarCompra(txtfolio.getText());
                if(c!=null){
                    Transaccion tr = new Transaccion(false);
                    tr.rellar(c.getFolioc(), c.getRutd(), c.getFecha(), c.getCodtp());
                    tr.dissAgregar();
                    tr.dissTrabajador();
                    tr.setVisible(true);
                    tr.setLocationRelativeTo(null);}
                else{   System.out.println("No hay objeto");}
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscartranActionPerformed

    private void btnagregartranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregartranActionPerformed
        // TODO add your handling code here:
        if(lblopcion4.getText().equals("Facturas")){
            Transaccion od = new Transaccion(true);
            od.setVisible(true);
            od.setLocationRelativeTo(null);
            od.dissMe();
        }else{
            Transaccion od = new Transaccion(false);
            od.setVisible(true);
            od.setLocationRelativeTo(null);
            od.dissMe();
            od.dissTrabajador();
        }
    }//GEN-LAST:event_btnagregartranActionPerformed

    private void btncerrartranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrartranActionPerformed
        cerrarPanels();
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrartranActionPerformed

    private void btnmtodotranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmtodotranActionPerformed
        // TODO add your handling code here:
        if(lblopcion4.getText().equals("Facturas")){
            llenarTablaVenta(operacion.mostrarTodoVent());
        }else{
            llenarTablaCompra(operacion.mostrarTodoCompra());
        }

    }//GEN-LAST:event_btnmtodotranActionPerformed

    
    private void llenarTabladet(ArrayList<Detalle> detlist){
    
        String title[]={"COD_CATE","NOMBRE"};
        if(!detlist.isEmpty()){
            TablaL tblibros=new TablaL();
            tblibros.crearTableDet(detlist, title);
            tblibros.setVisible(true);
        }else{JOptionPane.showMessageDialog(null, "No hay registros");}
    }
    private void llenarTablalibros(ArrayList<Libros> alist){
    
        String title[]={"SERIE","ISBN","TITULO","PAGINAS","PRECIO","AÑO","ESTADO","EDITORIAL"};
        if(!alist.isEmpty()){
            TablaL tblibros=new TablaL();
            tblibros.crearTablaL(alist,title);
            tblibros.setVisible(true);
            
        }else{JOptionPane.showMessageDialog(null, "No hay registros");}
    }
    
    private void llenarTablaaut(ArrayList<Autores> aulist){
    
        String title[]={"CODAUT","NOMBRE00","APE. P.","APE. M."};
        if(!aulist.isEmpty()){
            TablaL tblibros=new TablaL();
            tblibros.crearTablaAu(aulist, title);
            tblibros.setVisible(true);
        }else{JOptionPane.showMessageDialog(null, "No hay registros");}
    }
    private void llenarTabladist(ArrayList<Distribuidores> distlist){
    
        String title[]={"RUT","NOMBRE","CALLE","NUMERO","COMUNA","PAIS","FONO","AÑO DE CONTRATO"};
        if(!distlist.isEmpty()){
            TablaL tblibros=new TablaL();
            tblibros.crearTablaDist(distlist, title);
            tblibros.setVisible(true);
        }else{JOptionPane.showMessageDialog(null, "No hay registros");}
    }
    
    private void llenarTablaVenta(ArrayList<Venta> ventlist){
    
        String title[]={"FOLIOV","RUTT","RUTC","FECHA","CODTP"};
        if(!ventlist.isEmpty()){
            TablaL tblibros=new TablaL();
            tblibros.crearTableVent(ventlist, title);
            tblibros.setVisible(true);
        }else{JOptionPane.showMessageDialog(null, "No hay registros");}
    }
    private void llenarTablaCompra(ArrayList<Compra> clist){
    
        String title[]={"FOLIOC","RUTD","FECHA","CODTP"};
        if(!clist.isEmpty()){
            TablaL tblibros=new TablaL();
            tblibros.crearTableCompra(clist, title);
            tblibros.setVisible(true);
        }else{JOptionPane.showMessageDialog(null, "No hay registros");}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnagregaraut;
    private javax.swing.JButton btnagregardet;
    private javax.swing.JButton btnagregardist;
    private javax.swing.JButton btnagregartran;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscaraut;
    private javax.swing.JButton btnbuscardet;
    private javax.swing.JButton btnbuscardist;
    private javax.swing.JButton btnbuscartran;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btncerraraut;
    private javax.swing.JButton btncerrardet;
    private javax.swing.JButton btncerrardist;
    private javax.swing.JButton btncerrartran;
    private javax.swing.JButton btnmtodo;
    private javax.swing.JButton btnmtodoaut;
    private javax.swing.JButton btnmtododet;
    private javax.swing.JButton btnmtododist;
    private javax.swing.JButton btnmtodotran;
    private javax.swing.JMenu compra;
    private javax.swing.JMenuItem distribuidores;
    private javax.swing.JMenu facturas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblopcion;
    private javax.swing.JLabel lblopcion1;
    private javax.swing.JLabel lblopcion2;
    private javax.swing.JLabel lblopcion3;
    private javax.swing.JLabel lblopcion4;
    public static javax.swing.JLabel lbltitulo;
    public static javax.swing.JLabel lbltitulo1;
    public static javax.swing.JLabel lbltitulo2;
    public static javax.swing.JLabel lbltitulo3;
    public static javax.swing.JLabel lbltitulo4;
    private javax.swing.JMenu libros;
    private javax.swing.JMenuItem menuautor;
    private javax.swing.JMenuItem menucategoria;
    private javax.swing.JMenuItem menucompra;
    private javax.swing.JMenu menudist;
    private javax.swing.JMenuItem menueditorial;
    private javax.swing.JMenuItem menuestado;
    private javax.swing.JMenuItem menuidioma;
    private javax.swing.JMenuItem menulibro;
    private javax.swing.JMenuItem menumetpag;
    private javax.swing.JMenuItem menuventas;
    private javax.swing.JPanel panelautores;
    private javax.swing.JPanel paneldetalles;
    private javax.swing.JPanel paneldist;
    private javax.swing.JPanel panellibro;
    private javax.swing.JPanel paneltran;
    private javax.swing.JTextField txtcoddist;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigoau;
    private javax.swing.JTextField txtcodigodet;
    private javax.swing.JTextField txtfolio;
    // End of variables declaration//GEN-END:variables
}
