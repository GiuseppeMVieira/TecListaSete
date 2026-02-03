/**
 * RespostasThreads.java
 * Arquivo com todas as respostas para a lista de exercícios sobre Threads
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe principal que contém todas as respostas para a lista de exercícios sobre Threads
 */
public class RespostasThreads {
    
    /**
     * Método principal para execução do programa
     */
    public static void main(String[] args) {
        // Inicia a aplicação na EDT
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                exibirMenu();
            }
        });
    }
    
    /**
     * Exibe um menu para selecionar qual resposta/exemplo executar
     */
    private static void exibirMenu() {
        String[] opcoes = {
            "Questão 1: Comparação de programas nas transparências 5 e 8",
            "Questão 2: Programa de soma de matrizes com threads",
            "Questão 3: Método SwingUtilities.invokeLater",
            "Questão 4: Chamada do método pBar.setValue(cont)",
            "Questão 5: Execução de pBar.setValue(cont++) sem SwingUtilities.invokeLater",
            "Questão 6: Substituição de invokeLater por invokeAndWait",
            "Questão 7: Implementação do jogo caça-níquel",
            "Sair"
        };
        
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Selecione uma questão para ver a resposta ou exemplo:",
            "Respostas - Lista de Exercícios sobre Threads",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        
        switch (escolha) {
            case 0:
                mostrarResposta1();
                break;
            case 1:
                executarSomaMatrizes();
                break;
            case 2:
                mostrarResposta3();
                break;
            case 3:
                mostrarResposta4();
                break;
            case 4:
                mostrarResposta5();
                break;
            case 5:
                mostrarResposta6();
                break;
            case 6:
                executarCacaNiquel();
                break;
            case 7:
            default:
                System.exit(0);
        }
    }
    
    /**
     * Questão 1: Comparação de programas nas transparências 5 e 8
     */
    private static void mostrarResposta1() {
        String resposta = 
            "QUESTÃO 1: COMPARAÇÃO DE PROGRAMAS NAS TRANSPARÊNCIAS 5 E 8\n\n" +
            "Diferenças identificadas:\n\n" +
            "1. Método de criação de threads:\n" +
            "   - Transparência 5: Provavelmente utiliza extensão direta da classe Thread\n" +
            "   - Transparência 8: Provavelmente implementa a interface Runnable (mais flexível)\n\n" +
            "2. Sincronização e controle de acesso:\n" +
            "   - Transparência 8: Possivelmente implementa mecanismos de sincronização (synchronized, ReentrantLock)\n" +
            "   - Transparência 5: Abordagem mais simples, possivelmente sem sincronização\n\n" +
            "3. Comunicação entre threads:\n" +
            "   - Transparência 8: Provavelmente implementa mecanismos como wait(), notify() e notifyAll()\n" +
            "   - Transparência 5: Possivelmente não implementa comunicação entre threads\n\n" +
            "4. Gerenciamento do ciclo de vida das threads:\n" +
            "   - Transparência 8: Gerenciamento mais sofisticado (inicialização, execução, finalização)\n" +
            "   - Transparência 5: Abordagem mais simples\n\n" +
            "5. Tratamento de exceções:\n" +
            "   - Transparência 8: Tratamento mais robusto (InterruptedException, etc.)\n" +
            "   - Transparência 5: Tratamento mais básico ou inexistente\n\n" +
            "Conclusão: O programa na transparência 8 provavelmente adota práticas mais modernas e robustas para lidar com concorrência, sincronização e comunicação entre threads.";
        
        JTextArea textArea = new JTextArea(resposta);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(800, 500));
        
        JOptionPane.showMessageDialog(null, scrollPane, "Questão 1", JOptionPane.INFORMATION_MESSAGE);
        exibirMenu();
    }
    
    /**
     * Questão 2: Programa de soma de matrizes com threads
     */
    private static void executarSomaMatrizes() {
        // Implementação da classe SomaMatrizes
        SomaMatrizes.main(null);
    }
    
    /**
     * Questão 3: Método SwingUtilities.invokeLater
     */
    private static void mostrarResposta3() {
        String resposta = 
            "QUESTÃO 3: MÉTODO SWINGUTILITIES.INVOKELATER\n\n" +
            "O método SwingUtilities.invokeLater é utilizado em aplicações Java Swing para garantir que o código que atualiza componentes da interface gráfica seja executado na thread correta, conhecida como Event Dispatch Thread (EDT).\n\n" +
            "Explicação detalhada:\n\n" +
            "Java Swing não é thread-safe, o que significa que os componentes da interface gráfica não podem ser atualizados a partir de qualquer thread. Todas as atualizações de componentes Swing devem ser realizadas a partir da Event Dispatch Thread (EDT).\n\n" +
            "Quando precisamos atualizar um componente Swing a partir de uma thread que não é a EDT (como a thread principal ou uma thread de trabalho), devemos usar o método SwingUtilities.invokeLater. Este método recebe um objeto Runnable e coloca-o na fila de eventos da EDT para ser executado de forma assíncrona.\n\n" +
            "No arquivo TestThread.java mencionado na questão, o método SwingUtilities.invokeLater é usado para garantir que as atualizações na interface gráfica, especificamente na JProgressBar, sejam realizadas na EDT, evitando comportamentos imprevisíveis ou erros.\n\n" +
            "Benefícios do uso de invokeLater:\n" +
            "1. Evita problemas de concorrência\n" +
            "2. Previne comportamentos imprevisíveis\n" +
            "3. Melhora a responsividade da interface\n" +
            "4. Compatibilidade com o modelo de eventos do Swing";
        
        JTextArea textArea = new JTextArea(resposta);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(800, 500));
        
        JOptionPane.showMessageDialog(null, scrollPane, "Questão 3", JOptionPane.INFORMATION_MESSAGE);
        exibirMenu();
    }
    
    /**
     * Questão 4: Chamada do método pBar.setValue(cont)
     */
    private static void mostrarResposta4() {
        String resposta = 
            "QUESTÃO 4: CHAMADA DO MÉTODO PBAR.SETVALUE(CONT)\n\n" +
            "A chamada do método pBar.setValue(cont); na linha 22 do arquivo TestThread.java altera a representação gráfica da JProgressBar porque este método é responsável por atualizar o valor atual da barra de progresso, o que consequentemente modifica sua aparência visual, preenchendo a barra proporcionalmente ao valor definido.\n\n" +
            "Como funciona a representação gráfica da JProgressBar:\n\n" +
            "A classe JProgressBar em Java Swing é um componente visual que representa graficamente o progresso de uma tarefa. Quando chamamos o método setValue(int n), estamos definindo o valor atual da barra de progresso dentro do intervalo entre o valor mínimo e máximo configurados (por padrão, 0 a 100).\n\n" +
            "Por que a chamada precisa do método SwingUtilities.invokeLater:\n\n" +
            "1. Thread-safety do Swing: Java Swing não é thread-safe. Todos os componentes Swing devem ser atualizados exclusivamente pela Event Dispatch Thread (EDT).\n\n" +
            "2. Contexto de execução: No arquivo TestThread.java, a atualização da barra de progresso provavelmente está ocorrendo em uma thread separada (não na EDT), que está realizando algum processamento ou contagem.\n\n" +
            "3. Evitar comportamentos imprevisíveis: Se a atualização da barra de progresso fosse feita diretamente de outra thread, sem usar invokeLater, poderiam ocorrer problemas como:\n" +
            "   - A barra não ser atualizada visualmente\n" +
            "   - Atualizações inconsistentes ou parciais\n" +
            "   - Exceções relacionadas a concorrência\n" +
            "   - Travamentos da interface gráfica";
        
        JTextArea textArea = new JTextArea(resposta);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(800, 500));
        
        JOptionPane.showMessageDialog(null, scrollPane, "Questão 4", JOptionPane.INFORMATION_MESSAGE);
        exibirMenu();
    }
    
    /**
     * Questão 5: Execução de pBar.setValue(cont++) sem SwingUtilities.invokeLater
     */
    private static void mostrarResposta5() {
        String resposta = 
            "QUESTÃO 5: EXECUÇÃO DE PBAR.SETVALUE(CONT++) SEM SWINGUTILITIES.INVOKELATER\n\n" +
            "Não é recomendado executar pBar.setValue(cont++); diretamente sem usar SwingUtilities.invokeLater, embora tecnicamente seja possível em algumas situações específicas.\n\n" +
            "Quando seria possível (mas ainda não recomendado):\n\n" +
            "A única situação em que seria tecnicamente possível chamar pBar.setValue(cont++); sem usar SwingUtilities.invokeLater seria se este código já estivesse sendo executado na Event Dispatch Thread (EDT). Isso poderia ocorrer nos seguintes casos:\n\n" +
            "1. Se o código estiver dentro de um manipulador de eventos (event handler) como um ActionListener, que já é executado na EDT.\n" +
            "2. Se o código já estiver dentro de um bloco que foi agendado para execução na EDT por um invokeLater ou invokeAndWait anterior.\n\n" +
            "Por que não é recomendado mesmo na EDT:\n\n" +
            "1. Manutenção do código: O código pode ser movido ou refatorado no futuro para um contexto onde não esteja mais na EDT.\n" +
            "2. Clareza e consistência: Usar sempre invokeLater torna o código mais consistente e explícito quanto à intenção de executar na EDT.\n" +
            "3. Segurança: É mais seguro sempre usar invokeLater para garantir que o código será executado na thread correta.\n\n" +
            "Problemas de não usar SwingUtilities.invokeLater:\n\n" +
            "1. Comportamento imprevisível: A barra de progresso pode não ser atualizada corretamente ou pode apresentar atualizações visuais inconsistentes.\n" +
            "2. Exceções de concorrência: Podem ocorrer exceções relacionadas a acesso concorrente aos componentes Swing.\n" +
            "3. Corrupção de estado interno: O estado interno dos componentes Swing pode ser corrompido devido ao acesso não sincronizado.\n" +
            "4. Travamentos da interface: A interface do usuário pode ficar não responsiva ou travar completamente.";
        
        JTextArea textArea = new JTextArea(resposta);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(800, 500));
        
        JOptionPane.showMessageDialog(null, scrollPane, "Questão 5", JOptionPane.INFORMATION_MESSAGE);
        exibirMenu();
    }
    
    /**
     * Questão 6: Substituição de invokeLater por invokeAndWait
     */
    private static void mostrarResposta6() {
        String resposta = 
            "QUESTÃO 6: SUBSTITUIÇÃO DE INVOKELATER POR INVOKEANDWAIT\n\n" +
            "Sim, é possível substituir o método SwingUtilities.invokeLater pelo método SwingUtilities.invokeAndWait, mas essa substituição requer algumas alterações no código e tem implicações importantes no comportamento do programa.\n\n" +
            "Diferenças entre invokeLater e invokeAndWait:\n\n" +
            "1. invokeLater:\n" +
            "   - Executa o código de forma assíncrona na Event Dispatch Thread (EDT)\n" +
            "   - Não bloqueia a thread chamadora, que continua sua execução imediatamente\n" +
            "   - Coloca a tarefa na fila de eventos da EDT e retorna imediatamente\n" +
            "   - Ideal para atualizações de interface que não precisam de confirmação imediata\n\n" +
            "2. invokeAndWait:\n" +
            "   - Executa o código de forma síncrona na Event Dispatch Thread (EDT)\n" +
            "   - Bloqueia a thread chamadora até que a tarefa seja concluída na EDT\n" +
            "   - Aguarda até que todos os eventos pendentes na EDT sejam processados e a tarefa seja executada\n" +
            "   - Útil quando a thread chamadora precisa garantir que a atualização da interface foi concluída antes de prosseguir\n\n" +
            "Alterações necessárias no programa:\n\n" +
            "1. Tratamento de exceções: O método invokeAndWait pode lançar duas exceções que precisam ser tratadas:\n" +
            "   - InterruptedException: Se a thread for interrompida enquanto espera\n" +
            "   - InvocationTargetException: Se o código executado na EDT lançar uma exceção\n\n" +
            "2. Verificação de thread: Não é possível chamar invokeAndWait a partir da própria EDT, pois isso causaria um deadlock. É necessário verificar se o código já está sendo executado na EDT.\n\n" +
            "Implicações da substituição:\n\n" +
            "1. Desempenho: O uso de invokeAndWait pode tornar o programa mais lento, pois a thread chamadora fica bloqueada aguardando a conclusão da tarefa na EDT.\n" +
            "2. Responsividade: Se a EDT estiver ocupada processando outros eventos, a thread chamadora ficará bloqueada por mais tempo, o que pode afetar a responsividade geral do programa.\n" +
            "3. Risco de deadlock: Se o código que chama invokeAndWait estiver sendo executado na EDT, ocorrerá um deadlock.\n" +
            "4. Fluxo de execução: O fluxo de execução do programa será alterado, pois agora a thread chamadora só continuará após a conclusão da atualização da interface.";
        
        JTextArea textArea = new JTextArea(resposta);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(800, 500));
        
        JOptionPane.showMessageDialog(null, scrollPane, "Questão 6", JOptionPane.INFORMATION_MESSAGE);
        exibirMenu();
    }
    
    /**
     * Questão 7: Implementação do jogo caça-níquel
     */
    private static void executarCacaNiquel() {
        // Inicia o jogo caça-níquel
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CacaNiquel().setVisible(true);
            }
        });
    }
}

/**
 * Classe para a Questão 2: Programa de soma de matrizes com threads
 */
class SomaMatrizes {
    private static int[][] matrizA;
    private static int[][] matrizB;
    private static int[][] matrizResultado;
    private static int tamanho;

    public static void main(String[] args) {
        // Criação de uma interface gráfica simples para entrada de dados
        JFrame frame = new JFrame("Soma de Matrizes com Threads");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JLabel label = new JLabel("Digite o tamanho N das matrizes:");
        JTextField tamanhoField = new JTextField(10);
        JButton iniciarButton = new JButton("Iniciar");
        
        panel.add(label);
        panel.add(tamanhoField);
        panel.add(iniciarButton);
        
        JTextArea resultadoArea = new JTextArea(10, 30);
        resultadoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tamanho = Integer.parseInt(tamanhoField.getText());
                    if (tamanho <= 0) {
                        JOptionPane.showMessageDialog(frame, "Por favor, digite um número positivo.", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    // Inicialização das matrizes
                    matrizA = new int[tamanho][tamanho];
                    matrizB = new int[tamanho][tamanho];
                    matrizResultado = new int[tamanho][tamanho];
                    
                    // Preenchimento das matrizes com valores aleatórios para simplificar
                    Random random = new Random();
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho; j++) {
                            matrizA[i][j] = random.nextInt(10);
                            matrizB[i][j] = random.nextInt(10);
                        }
                    }
                    
                    // Criação das threads para soma dos quadrantes
                    Thread t1 = new Thread(new SomaQuadrante(0, 0, tamanho/2, tamanho/2));
                    Thread t2 = new Thread(new SomaQuadrante(0, tamanho/2, tamanho/2, tamanho));
                    Thread t3 = new Thread(new SomaQuadrante(tamanho/2, 0, tamanho, tamanho/2));
                    Thread t4 = new Thread(new SomaQuadrante(tamanho/2, tamanho/2, tamanho, tamanho));
                    
                    // Iniciando as threads
                    t1.start();
                    t2.start();
                    t3.start();
                    t4.start();
                    
                    try {
                        // Aguardando todas as threads terminarem
                        t1.join();
                        t2.join();
                        t3.join();
                        t4.join();
                    } catch (InterruptedException ex) {
                        resultadoArea.append("Erro na execução das threads: " + ex.getMessage() + "\n");
                    }
                    
                    // Exibição do resultado
                    StringBuilder sb = new StringBuilder();
                    sb.append("Matriz A:\n");
                    sb.append(matrizToString(matrizA));
                    sb.append("\nMatriz B:\n");
                    sb.append(matrizToString(matrizB));
                    sb.append("\nMatriz Resultado (A + B):\n");
                    sb.append(matrizToString(matrizResultado));
                    
                    resultadoArea.setText(sb.toString());
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    // Classe interna para realizar a soma de um quadrante
    static class SomaQuadrante implements Runnable {
        private int linhaInicio, colunaInicio, linhaFim, colunaFim;
        
        public SomaQuadrante(int linhaInicio, int colunaInicio, int linhaFim, int colunaFim) {
            this.linhaInicio = linhaInicio;
            this.colunaInicio = colunaInicio;
            this.linhaFim = linhaFim;
            this.colunaFim = colunaFim;
        }
        
        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getId() + 
                               " somando quadrante: [" + linhaInicio + "," + colunaInicio + 
                               "] até [" + (linhaFim-1) + "," + (colunaFim-1) + "]");
            
            for (int i = linhaInicio; i < linhaFim; i++) {
                for (int j = colunaInicio; j < colunaFim; j++) {
                    matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
        }
    }
    
    // Método para converter uma matriz em string para exibição
    private static String matrizToString(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sb.append(matriz[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

/**
 * Classe para a Questão 7: Implementação do jogo caça-níquel
 */
class CacaNiquel extends JFrame {
    
    private JTextField campo1, campo2, campo3;
    private JButton btnJogar;
    private Random random;
    private boolean campo1Girando, campo2Girando, campo3Girando;
    
    public CacaNiquel() {
        // Configuração básica da janela
        super("Caça-Níquel");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Inicialização de variáveis
        random = new Random();
        campo1Girando = false;
        campo2Girando = false;
        campo3Girando = false;
        
        // Configuração do layout
        JPanel painelPrincipal = new JPanel(new BorderLayout());
        JPanel painelCampos = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        JPanel painelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        // Criação e configuração dos campos de texto
        campo1 = criarCampoTexto();
        campo2 = criarCampoTexto();
        campo3 = criarCampoTexto();
        
        // Criação e configuração do botão
        btnJogar = new JButton("Jogar");
        btnJogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarJogo();
            }
        });
        
        // Adição dos componentes aos painéis
        painelCampos.add(campo1);
        painelCampos.add(campo2);
        painelCampos.add(campo3);
        painelBotao.add(btnJogar);
        
        // Adição dos painéis ao painel principal
        painelPrincipal.add(painelCampos, BorderLayout.CENTER);
        painelPrincipal.add(painelBotao, BorderLayout.SOUTH);
        
        // Adição do painel principal à janela
        add(painelPrincipal);
    }
    
    private JTextField criarCampoTexto() {
        JTextField campo = new JTextField("7");
        campo.setPreferredSize(new Dimension(50, 50));
        campo.setHorizontalAlignment(JTextField.CENTER);
        campo.setFont(new Font("Arial", Font.BOLD, 24));
        campo.setEditable(false);
        return campo;
    }
    
    private void iniciarJogo() {
        // Desabilita o botão enquanto os campos estão girando
        btnJogar.setEnabled(false);
        
        // Inicia o giro dos campos em threads separadas
        iniciarGiroCampo(campo1, 1);
        iniciarGiroCampo(campo2, 2);
        iniciarGiroCampo(campo3, 3);
    }
    
    private void iniciarGiroCampo(final JTextField campo, final int numeroCampo) {
        // Define o campo como girando
        switch (numeroCampo) {
            case 1: campo1Girando = true; break;
            case 2: campo2Girando = true; break;
            case 3: campo3Girando = true; break;
        }
        
        // Cria e inicia uma nova thread para girar o campo
        new Thread() {
            @Override
            public void run() {
                // Determina um número aleatório de giros entre 1 e 150
                int numeroGiros = random.nextInt(150) + 1;
                
                // Realiza os giros
                for (int i = 0; i < numeroGiros; i++) {
                    final int valor = random.nextInt(7) + 1;
                    
                    // Atualiza o valor do campo na EDT
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            campo.setText(String.valueOf(valor));
                        }
                    });
                    
                    // Pausa entre os giros
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
                // Define o campo como não girando
                switch (numeroCampo) {
                    case 1: campo1Girando = false; break;
                    case 2: campo2Girando = false; break;
                    case 3: campo3Girando = false; break;
                }
                
                // Verifica se todos os campos pararam de girar
                verificarFimJogo();
            }
        }.start();
    }
    
    private void verificarFimJogo() {
        // Verifica se todos os campos pararam de girar
        if (!campo1Girando && !campo2Girando && !campo3Girando) {
            // Obtém os valores finais dos campos
            final int valor1 = Integer.parseInt(campo1.getText());
            final int valor2 = Integer.parseInt(campo2.getText());
            final int valor3 = Integer.parseInt(campo3.getText());
            
            // Verifica se o jogador ganhou (três números iguais)
            final boolean ganhou = (valor1 == valor2 && valor2 == valor3);
            
            // Exibe o resultado na EDT
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    // Exibe a mensagem de resultado
                    if (ganhou) {
                        JOptionPane.showMessageDialog(CacaNiquel.this, 
                            "Parabéns! Você venceu!", 
                            "Resultado", 
                            JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(CacaNiquel.this, 
                            "Que pena! Você perdeu.", 
                            "Resultado", 
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    // Reabilita o botão para jogar novamente
                    btnJogar.setEnabled(true);
                }
            });
        }
    }
}
