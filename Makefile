COMP=javac

FLAGS=

java: *.java
	$(COMP) $(FLAGS) $^ 

clean:
	rm -rf ./*.class

help:
	@printf "\n\tAula prática de refactoring, EngSoft - UFMG 2020/2\n"
	@printf "\tCódigo em Java\n\n"
	@printf "\tModo de usar:\n\n"
	@printf "\tmake [Targets]\n\n"
	@printf "\tLista de Targets:\n"
	@printf "\t      : compilar apenas\n"
	@printf "\tclean : limpar arquivos\n"
	@printf "\thelp  : mostrar esta ajuda\n\n"

