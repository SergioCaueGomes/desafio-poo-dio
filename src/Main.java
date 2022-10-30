import br.com.dio.desafio.dominio.*;


import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSergio = new Dev();
        devSergio.setNome("Sergio");
        devSergio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sergio" + devSergio.getConteudosInscritos());
        devSergio.progredir();
        devSergio.progredir();
        System.out.println("Conteúdos Inscritos Sergio" + devSergio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sergio" + devSergio.getConteudosConcluidos());
        System.out.println("XP:" + devSergio.calcularTotalXp());

        System.out.println("-----------");

        Dev devKarla = new Dev();
        devKarla.setNome("Karla");
        devKarla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Karla" + devKarla.getConteudosInscritos());
        devKarla.progredir();
        devKarla.progredir();
        devKarla.progredir();
        System.out.println("Conteúdos Inscritos Karla" + devKarla.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Karla" + devKarla.getConteudosConcluidos());
        System.out.println("XP:" + devKarla.calcularTotalXp());


    }
}