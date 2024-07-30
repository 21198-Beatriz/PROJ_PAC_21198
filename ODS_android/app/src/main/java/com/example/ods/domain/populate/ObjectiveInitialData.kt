package com.example.ods.domain.populate

import android.graphics.Color.rgb
import androidx.compose.ui.graphics.Color
import com.example.ods.domain.model.Indicator
import com.example.ods.domain.model.Meta
import com.example.ods.domain.model.Objective

fun populateObjectiveInitialData() : List<Objective> {
    val colors = listOf(
        Color(rgb(230, 34, 61)),
        Color(rgb(222, 167, 58)),
        Color(rgb(76, 162, 71)),
        Color(rgb(199, 32, 48)),
        Color(rgb(239, 64, 46)),
        Color(rgb(38, 191, 231)),
        Color(rgb(251, 196, 19)),
        Color(rgb(164, 28, 69)),
        Color(rgb(242, 106, 47)),
        Color(rgb(224, 19, 129)),
        Color(rgb(248, 157, 42)),
        Color(rgb(192, 142, 45)),
        Color(rgb(63, 127, 69)),
        Color(rgb(31, 151, 213)),
        Color(rgb(90, 186, 72)),
        Color(rgb(19, 106, 159)),
        Color(rgb(19, 73, 107))
    )
    val objective1Metas = listOf(
        Meta(
            id = 1,
            title = " Meta 1.1",
            description = "Até 2030, erradicar a pobreza extrema em todos os lugares, atualmente medida como pessoas que vivem com menos de 1,25 dólares por dia",
            indicators = listOf(
                Indicator(metaId = 1, title = "1.1.1", description = "Proporção da população cujo rendimento equivalente se encontra abaixo da linha de pobreza internacional (definida como US$1.90 por dia), por sexo, grupo etário, condição perante o trabalho e grau de urbanização")
            )
        ),
        Meta(
            id = 2,
            title = "Meta 1.2",
            description = "Até 2030, reduzir pelo menos para metade a proporção de homens, mulheres e crianças, de todas as idades, que vivem na pobreza, em todas as suas dimensões, de acordo com as definições nacionais",
            indicators = listOf(
                Indicator(metaId = 2, title = "1.2.1", description = "Proporção da população cujo rendimento equivalente se encontra abaixo da linha de pobreza nacional, por sexo e grupo etário"),
                Indicator(metaId = 2, title = "1.2.2", description = "Proporção de homens, mulheres e crianças de todas as idades cujo rendimento equivalente se encontra abaixo da linha de pobreza nacional, para as várias dimensões de análise")
            )
        ),
        Meta(
            id = 3,
            title = "Meta 1.3",
            description = "Implementar, a nível nacional, medidas e sistemas de proteção social adequados, para todos, incluindo limiares, e até 2030 atingir uma cobertura substancial dos mais pobres e vulneráveis",
            indicators = listOf(
                Indicator(metaId = 3, title = "1.3.1", description = "Proporção da população abrangida por regimes de proteção social, por sexo e para os seguintes grupos populacionais: crianças, população desempregada, população idosa, população com incapacidade, mulheres grávidas, crianças recém-nascidas, pessoas que sofreram acidentes")
            )
        ),
        Meta(
            id = 4,
            title = "Meta 1.4",
            description = "Até 2030, garantir que todos os homens e mulheres, particularmente os mais pobres e vulneráveis, tenham direitos iguais no acesso aos recursos económicos, bem como no acesso aos serviços básicos, à propriedade e controlo sobre a terra e outras formas de propriedade, à herança, aos recursos naturais, às novas tecnologias e aos serviços financeiros, incluindo microfinanciamento.",
            indicators = listOf(
                Indicator(metaId = 4, title = "1.4.1", description = "Proporção da população que habita em alojamentos com acesso a serviços básicos"),
                Indicator(metaId = 4, title = "1.4.2", description = "Proporção da população adulta total com direito de posse à terra, (a) com documentação legalmente reconhecida e (b) que percecionem os seus direitos à terra como seguros, por sexo e por tipo de posse")
            )
        ),
        Meta(
            id = 5,
            title = "Meta 1.5",
            description = "Até 2030, aumentar a resiliência dos mais pobres e em situação de maior vulnerabilidade, e reduzir a exposição e a vulnerabilidade destes aos fenómenos extremos relacionados com o clima e outros choques e desastres económicos, sociais e ambientais",
            indicators = listOf(
                Indicator(metaId = 5, title = "1.5.1", description = "Número de mortes, pessoas desaparecidas e pessoas diretamente afetadas devido a catástrofes por 100 mil habitantes"),
                Indicator(metaId = 5, title = "1.5.2", description = "Perdas económicas diretas atribuídas a desastres em relação ao Produto Interno Bruto (PIB) global"),
                Indicator(metaId = 5, title = "1.5.3", description = "Número de países que adotaram e implementaram estratégias nacionais de redução de risco de desastres em linha com o Quadro de Sendai para a Redução de Risco de Desastres 2015-2030"),
                Indicator(metaId = 5, title = "1.5.4", description = "Proporção de governos locais que adotaram e implementaram estratégias locais de redução de risco de desastres em linha com as estratégias nacionais de redução de risco de desastres")
            )
        ),
        Meta(
            id = 6,
            title = "Meta 1.a",
            description = "Garantir uma mobilização significativa de recursos a partir de uma variedade de fontes, inclusive por meio do reforço da cooperação para o desenvolvimento, para proporcionar meios adequados e previsíveis para que os países em desenvolvimento (em particular, os países menos desenvolvidos) possam implementar programas e políticas para acabar com a pobreza em todas as suas dimensões",
            indicators = listOf(
                Indicator(metaId = 6, title = "1.a.1", description = "Total de donativos da ajuda pública ao desenvolvimento de todos os doadores que se destinam à redução da pobreza em percentagem do RNB do país beneficiário"),
                Indicator(metaId = 6, title = "1.a.2", description = "Proporção do total das despesas públicas com serviços essenciais (educação, saúde e proteção social)")
            )
        ),
        Meta(
            id = 7,
            title = "Meta 1.b",
            description = "Criar enquadramentos políticos sólidos ao nível nacional, regional e internacional, com base em estratégias de desenvolvimento em prol dos mais pobres e sensíveis às questão da igualdade do género, para apoiar a aceleração do investimento em ações de erradicação da pobreza",
            indicators = listOf(
                Indicator(metaId = 7, title = "1.b.1", description = "Despesas sociais públicas no combate à pobreza")
            )
        )
    )

    val objective2Metas = listOf(
        Meta(
            id = 8,
            title = "Meta 2.1",
            description = "Até 2030, acabar com a fome e garantir o acesso de todas as pessoas, em particular os mais pobres e pessoas em situações vulneráveis, incluindo crianças, a uma alimentação de qualidade, nutritiva e suficiente durante todo o ano",
            indicators = listOf(
                Indicator(metaId = 8, title = "2.1.1", description = "Prevalência da subnutrição"),
                Indicator(metaId = 8, title = "2.1.2", description = "Prevalência da insegurança alimentar moderada ou grave na população residente (de acordo com a FIES, escala de insegurança alimentar)")
            )
        ),
        Meta(
            id = 9,
            title = "Meta 2.2",
            description = "Até 2030, acabar com todas as formas de malnutrição, incluindo atingir, até 2025, as metas acordadas internacionalmente sobre nanismo e caquexia em crianças menores de cinco anos, e atender às necessidades nutricionais das adolescentes, das mulheres grávidas e lactantes e das pessoas idosas",
            indicators = listOf(
                Indicator(metaId = 9, title = "2.2.1", description = "Prevalência de atrasos no crescimento nas crianças com menos de 5 anos de idade"),
                Indicator(metaId = 9, title = "2.2.2", description = "Prevalência de malnutrição nas crianças com menos de 5 anos de idade, por tipo de malnutrição (baixo peso e excesso de peso)"),
                Indicator(metaId = 9, title = "2.2.3", description = "Prevalência de anemia em mulheres de 15 a 49 anos, segundo o estado de gravidez (percentagem)")
            )
        ),
        Meta(
            id = 10,
            title = "Meta 2.3",
            description = "Até 2030, duplicar a produtividade agrícola e o rendimento dos pequenos produtores de alimentos, particularmente das mulheres, povos indígenas, agricultores de subsistência, pastores e pescadores, nomeadamente através de garantia de acesso igualitário à terra e a outros recursos produtivos tais como conhecimento, serviços financeiros, mercados e oportunidades de valor acrescentado e de emprego não agrícola",
            indicators = listOf(
                Indicator(metaId = 10, title = "2.3.1", description = "Volume de produção por unidade de trabalho por dimensão da empresa agrícola/pastoril/florestal"),
                Indicator(metaId = 10, title = "2.3.2", description = "Rendimento médio dos pequenos produtores alimentares, por sexo e condição de indígena")
            )
        ),
        Meta(
            id = 11,
            title = "Meta 2.4",
            description = "Até 2030, garantir sistemas sustentáveis de produção de alimentos e implementar práticas agrícolas resilientes, que aumentem a produtividade e a produção, que ajudem a manter os ecossistemas, que fortaleçam a capacidade de adaptação às alterações climáticas, às condições meteorológicas extremas, secas, inundações e outros desastres, e que melhorem progressivamente a qualidade da terra e do solo",
            indicators = listOf(
                Indicator(metaId = 11, title = "2.4.1", description = "Proporção da Superfície Agrícola Utilizada (SAU) afeta a práticas agrícolas produtivas e sustentáveis")
            )
        ),
        Meta(
            id = 12,
            title = "Meta 2.5",
            description = "Até 2020, manter a diversidade genética de sementes, plantas cultivadas, animais de criação e domesticados e suas respetivas espécies selvagens, inclusive por meio de bancos de sementes e plantas que sejam diversificados e bem geridos ao nível nacional, regional e internacional, e promover o acesso e a repartição justa e equitativa dos benefícios decorrentes da utilização dos recursos genéticos e conhecimentos tradicionais associados, tal como acordado internacionalmente",
            indicators = listOf(
                Indicator(metaId = 12, title = "2.5.1", description = "Número de recursos genéticos vegetais e animais para a alimentação e agricultura, protegidos a médio ou longo prazo em instalações de conservação"),
                Indicator(metaId = 12, title = "2.5.2", description = "Proporção de raças locais classificadas em risco de extinção")
            )
        ),
        Meta(
            id = 13,
            title = "Meta 2.a",
            description = "Aumentar o investimento, inclusive através do reforço da cooperação internacional, nas infraestruturas rurais, investigação e extensão de serviços agrícolas, desenvolvimento de tecnologia, e os bancos de genes de plantas e animais, para aumentar a capacidade de produção agrícola nos países em desenvolvimento, em particular nos países menos desenvolvidos",
            indicators = listOf(
                Indicator(metaId = 13, title = "2.a.1", description = "Índice de orientação agrícola para a despesa pública"),
                Indicator(metaId = 13, title = "2.a.2", description = "Total de fluxos oficiais (ajuda pública ao desenvolvimento e outros fluxos oficiais) para o setor agrícola")
            )
        ),
        Meta(
            id = 14,
            title = "Meta 2.b",
            description = "Corrigir e prevenir as restrições ao comércio e distorções nos mercados agrícolas mundiais, incluindo a eliminação em paralelo de todas as formas de subsídios à exportação e todas as medidas de exportação com efeito equivalente, de acordo com o mandato da Ronda de Desenvolvimento de Doha",
            indicators = listOf(
                Indicator(metaId = 14, title = "2.b.1", description = "Subsídios às exportações agrícolas")
            )
        ),
        Meta(
            id = 15,
            title = "Meta 2.c",
            description = "Adotar medidas para garantir o funcionamento adequado dos mercados de matérias-primas agrícolas e seus derivados, e facilitar o acesso oportuno à informação sobre o mercado, inclusive sobre as reservas alimentares, a fim de ajudar a limitar a volatilidade extrema dos preços dos alimentos",
            indicators = listOf(
                Indicator(metaId = 15, title = "2.c.1", description = "Indicador de anomalias dos preços de alimentação")
            )
        )
    )

    val objective3Metas = listOf(
        Meta(
            id = 16,
            title = "Meta 3.1",
            description = "Até 2030, reduzir a taxa de mortalidade materna global para menos de 70 mortes por 100 000 nados-vivos",
            indicators = listOf(
                Indicator(metaId = 16, title = "3.1.1", description = "Taxa de mortalidade materna"),
                Indicator(metaId = 16, title = "3.1.2", description = "Proporção de nascimentos (nados-vivos) assistidos por pessoal de saúde qualificado")
            )
        ),
        Meta(
            id = 17,
            title = "Meta 3.2",
            description = "Até 2030, acabar com as mortes evitáveis de recém-nascidos e crianças menores de 5 anos, com todos os países empenhados em reduzir a mortalidade neonatal para pelo menos 12 por 1 000 nados-vivos e a mortalidade de crianças menores de 5 anos para pelo menos 25 por 1 000 nados-vivos",
            indicators = listOf(
                Indicator(metaId = 17, title = "3.2.1", description = "Taxa de mortalidade antes dos 5 anos"),
                Indicator(metaId = 17, title = "3.2.2", description = "Taxa de mortalidade neonatal")
            )
        ),
        Meta(
            id = 18,
            title = "Meta 3.3",
            description = "Até 2030, acabar com as epidemias de SIDA, tuberculose, malária e doenças tropicais negligenciadas, e combater a hepatite, doenças transmitidas pela água e outras doenças transmissíveis",
            indicators = listOf(
                Indicator(metaId = 18, title = "3.3.1", description = "Número de novos casos de infeção por VIH por 1 000 habitantes, por sexo, grupo etário e populações específicas"),
                Indicator(metaId = 18, title = "3.3.2", description = "Taxa de incidência da tuberculose por 100 mil habitantes"),
                Indicator(metaId = 18, title = "3.3.3", description = "Taxa de incidência da malária por 1 000 habitantes"),
                Indicator(metaId = 18, title = "3.3.4", description = "Taxa de incidência da hepatite B por 100 mil habitantes"),
                Indicator(metaId = 18, title = "3.3.5", description = "Número de pessoas que necessitam de intervenções contra doenças tropicais negligenciadas (DTN)")
            )
        ),
        Meta(
            id = 19,
            title = "Meta 3.4",
            description = "Até 2030, reduzir num terço a mortalidade prematura por doenças não transmissíveis via prevenção e tratamento, e promover a saúde mental e o bem-estar",
            indicators = listOf(
                Indicator(metaId = 19, title = "3.4.1", description = "Taxa de mortalidade atribuída a doenças do aparelho circulatório, tumores malignos, diabetes mellitus e doenças crónicas respiratórias"),
                Indicator(metaId = 19, title = "3.4.2", description = "Taxa de mortalidade por lesões autoprovocadas intencionalmente (suicídio)")
            )
        ),
        Meta(
            id = 20,
            title = "Meta 3.5",
            description = "Reforçar a prevenção e o tratamento do abuso de substâncias, incluindo o abuso de drogas e o uso nocivo do álcool",
            indicators = listOf(
                Indicator(metaId = 20, title = "3.5.1", description = "Cobertura das intervenções (farmacológicas, psicossociais, de reabilitação e de pós-tratamento) com vista ao tratamento do abuso de substâncias"),
                Indicator(metaId = 20, title = "3.5.2", description = "Consumo de litros de álcool puro per capita (pessoas com 15 ou mais anos) por ano")
            )
        ),
        Meta(
            id = 21,
            title = "Meta 3.6",
            description = "Até 2020, reduzir para metade, a nível global, o número de mortos e feridos devido a acidentes rodoviários",
            indicators = listOf(
                Indicator(metaId = 21, title = "3.6.1", description = "Taxa de mortalidade por acidentes rodoviários")
            )
        ),
        Meta(
            id = 22,
            title = "Meta 3.7",
            description = "Até 2030, assegurar o acesso universal aos serviços de saúde sexual e reprodutiva, incluindo o planeamento familiar, informação e educação, bem como a integração da saúde reprodutiva em estratégias e programas nacionais",
            indicators = listOf(
                Indicator(metaId = 22, title = "3.7.1", description = "Proporção de mulheres em idade reprodutiva (15 a 49 anos) que utilizam métodos de planeamento familiar modernos"),
                Indicator(metaId = 22, title = "3.7.2", description = "Número de nados-vivos de mães adolescentes (grupos etários 10-14 e 15-19) por 1 000 mulheres destes grupos etários")
            )
        ),
        Meta(
            id = 23,
            title = "Meta 3.8",
            description = "Atingir a cobertura universal de saúde, incluindo a proteção do risco financeiro, o acesso a serviços de saúde essenciais de qualidade e o acesso a medicamentos e vacinas essenciais para todos de forma segura, eficaz, de qualidade e a preços acessíveis",
            indicators = listOf(
                Indicator(metaId = 23, title = "3.8.1", description = "Cobertura dos cuidados de saúde primários"),
                Indicator(metaId = 23, title = "3.8.2", description = "Proporção da população que vive em agregados com sobrecarga das despesas familiares em saúde relativamente ao total das despesas familiares ou do rendimento familiar")
            )
        ),
        Meta(
            id = 24,
            title = "Meta 3.9",
            description = "Até 2030, reduzir substancialmente o número de mortes e doenças devido a químicos perigosos, contaminação e poluição do ar, água e solo",
            indicators = listOf(
                Indicator(metaId = 24, title = "3.9.1", description = "Taxa de mortalidade atribuída a poluição ambiente e doméstica do ar"),
                Indicator(metaId = 24, title = "3.9.2", description = "Taxa de mortalidade atribuída a fontes de água insalubre e a condições de saneamento e de higiene deficientes ou inexistentes (acesso inadequado a serviços de saneamento de águas residuais)"),
                Indicator(metaId = 24, title = "3.9.3", description = "Taxa de mortalidade atribuída a envenenamento acidental")
            )
        ),
        Meta(
            id = 25,
            title = "Meta 3.a",
            description = "Fortalecer a implementação da Convenção Quadro para o Controlo do Tabaco em todos os países, conforme apropriado",
            indicators = listOf(
                Indicator(metaId = 25, title = "3.a.1", description = "Proporção de fumadores com 15 ou mais anos relativamente ao total da população com 15 ou mais anos")
            )
        ),
        Meta(
            id = 26,
            title = "Meta 3.b",
            description = "Apoiar a pesquisa e o desenvolvimento de vacinas e medicamentos para as doenças transmissíveis e não transmissíveis, que afetam principalmente os países em desenvolvimento, proporcionar o acesso a medicamentos e vacinas essenciais a preços acessíveis, de acordo com a Declaração de Doha, que dita o direito, por parte dos países em desenvolvimento, de utilizarem plenamente as disposições do acordo TRIPS sobre flexibilidades para proteger a saúde pública e, em particular, proporcionar o acesso a medicamentos para todos",
            indicators = listOf(
                Indicator(metaId = 26, title = "3.b.1", description = "Taxa de cobertura vacinal da população relativamente às vacinas incluídas no Programa Nacional de Vacinação"),
                Indicator(metaId = 26, title = "3.b.2", description = "Ajuda pública ao desenvolvimento total líquida para a investigação médica e para os sectores básicos de saúde"),
                Indicator(metaId = 26, title = "3.b.3", description = "Proporção de estabelecimentos de saúde que dispõem de um conjunto básico de medicamentos essenciais e relevantes disponíveis e a custo acessível numa base sustentável")
            )
        ),
        Meta(
            id = 27,
            title = "Meta 3.c",
            description = "Aumentar substancialmente o financiamento da saúde e o recrutamento, desenvolvimento, formação e retenção do pessoal de saúde nos países em desenvolvimento, especialmente nos países menos desenvolvidos e nos pequenos Estados insulares em desenvolvimento",
            indicators = listOf(
                Indicator(metaId = 27, title = "3.c.1", description = "Intensidade per capita dos profissionais de saúde e repartição por especialidade")
            )
        ),
        Meta(
            id = 28,
            title = "Meta 3.d",
            description = "Reforçar a capacidade de todos os países, particularmente os países em desenvolvimento, para o alerta precoce, redução de riscos e gestão de riscos nacionais e globais de saúde",
            indicators = listOf(
                Indicator(metaId = 28, title = "3.d.1", description = "Capacidade para o Regulamento Sanitário Internacional (RSI) e preparação para emergências de saúde"),
                Indicator(metaId = 28, title = "3.d.2", description = "Reduzir a percentagem de infeções da corrente sanguínea devido a organismos resistentes a antimicrobianos selecionados")
            )
        )
    )
    val objective4Metas = listOf(
        Meta(
            id = 29,
            title = "Meta 4.1",
            description = "Até 2030, garantir que todas as meninas e meninos completam o ensino primário e secundário, que deve ser de acesso livre, equitativo e de qualidade, conduzindo a resultados de aprendizagem relevantes e eficazes",
            indicators = listOf(
                Indicator(metaId = 29, title = "4.1.1", description = "Proporção de crianças e jovens: (a) nos segundo e terceiro anos do primeiro ciclo do ensino básico; (b) no final do segundo ciclo do ensino básico; e (c) no final do terceiro ciclo do ensino básico, que atingiram um nível mínimo de proficiência em (i) leitura e (ii) matemática, por sexo"),
                Indicator(metaId = 29, title = "4.1.2", description = "Taxa de conclusão (ensino básico, 1º, 2º e 3º ciclo, ensino secundário)")
            )
        ),
        Meta(
            id = 30,
            title = "Meta 4.2",
            description = "Até 2030, garantir que todos as meninas e meninos tenham acesso a um desenvolvimento de qualidade na primeira infância, bem como cuidados e educação pré-escolar, de modo a que estejam preparados para o ensino primário",
            indicators = listOf(
                Indicator(title = "4.2.1", description = "Proporção de crianças com menos de 5 anos que estão dentro dos parâmetros de desenvolvimento em termos de saúde, aprendizagem e bem-estar psicossocial, por sexo"),
                Indicator(title = "4.2.2", description = "Taxa de participação em atividades de aprendizagem organizada (um ano antes da idade oficial de entrada para o 1º ciclo), por sexo")
            )
        ),
        Meta(
            id = 31,
            title = "Meta 4.3",
            description = "Até 2030, assegurar a igualdade de acesso para todos os homens e mulheres à educação técnica, profissional e terciária, incluindo a universidade, com qualidade e a preços acessíveis",
            indicators = listOf(
                Indicator(title = "4.3.1", description = "Taxa de participação de jovens e adultos em educação formal e não formal, nos últimos 12 meses, por sexo")
            )
        ),
        Meta(
            id = 32,
            title = "Meta 4.4",
            description = "Até 2030, aumentar substancialmente o número de jovens e adultos que tenham habilitações relevantes, inclusive competências técnicas e profissionais, para emprego, trabalho decente e empreendedorismo",
            indicators = listOf(
                Indicator(title = "4.4.1", description = "Proporção de jovens e adultos com competências em tecnologias de informação e comunicação (TIC), por tipo de competência")
            )
        ),
        Meta(
            id = 33,
            title = "Meta 4.5",
            description = "Até 2030, eliminar as disparidades de género na educação e garantir a igualdade de acesso a todos os níveis de educação e formação profissional para os mais vulneráveis, incluindo as pessoas com deficiência, população autóctone e crianças em situação de vulnerabilidade",
            indicators = listOf(
                Indicator(title = "4.5.1", description = "Índices de paridade (mulher/homem, rural/urbano, 1º/5º quintis de riqueza e outros como estado de incapacidade, populações indígenas e populações afetadas por conflitos, à medida que os dados estejam disponíveis) para todos os indicadores nesta lista que possam ser desagregados")
            )
        ),
        Meta(
            id = 34,
            title = "Meta 4.6",
            description = "Até 2030, garantir literacia e aptidões numéricas a todos os jovens e a uma substancial proporção dos adultos, homens e mulheres",
            indicators = listOf(
                Indicator(title = "4.6.1", description = "Percentagem da população de um dado grupo etário que atingiu pelo menos um determinado nível de proficiência em competências de (a) literacia e (b) numeracia funcionais, por sexo")
            )
        ),
        Meta(
            id = 35,
            title = "Meta 4.7",
            description = "Até 2030, garantir que todos os alunos adquiram os conhecimentos e habilidades necessários para promover o desenvolvimento sustentável, inclusive por meio da educação para o desenvolvimento e estilos de vida sustentáveis, direitos humanos, igualdade de género, promoção de uma cultura de paz, cidadania global e valorização da diversidade cultural e da contribuição da cultura para o desenvolvimento sustentável",
            indicators = listOf(
                Indicator(title = "4.7.1", description = "Grau com que a (i) educação para a cidadania global e a (ii) educação para o desenvolvimento sustentável são disseminados em (a) políticas educativas nacionais, (b) programas educativos, (c) formação de professores e (d) avaliação de estudantes")
            )
        ),
        Meta(
            id = 36,
            title = "Meta 4.a",
            description = "Construir e melhorar instalações físicas para educação, apropriadas para crianças e sensíveis às deficiências e às questões de género, e que proporcionem ambientes de aprendizagem seguros e não violentos, inclusivos e eficazes para todos",
            indicators = listOf(
                Indicator(title = "4.a.1", description = "Proporção de escolas que oferecem serviços básicos, por tipo de serviço")
            )
        ),
        Meta(
            id = 37,
            title = "Meta 4.b",
            description = "Até 2020, ampliar substancialmente, a nível global, o número de bolsas de estudo – para os países em desenvolvimento, em particular os países menos desenvolvidos, pequenos Estados insulares em desenvolvimento e os países africanos – para o ensino superior, incluindo programas de formação profissional, de tecnologia da informação e da comunicação, programas técnicos, científicos e de engenharia, em países desenvolvidos e outros países em desenvolvimento",
            indicators = listOf(
                Indicator(title = "4.b.1", description = "Volume dos fluxos de ajuda pública ao desenvolvimento para bolsas por sector e tipo de programa")
            )
        ),
        Meta(
            id = 38,
            title = "Meta 4.c",
            description = "Até 2030, aumentar substancialmente o contingente de professores qualificados, inclusive por meio da cooperação internacional para a formação de professores, nos países em desenvolvimento, especialmente os países menos desenvolvidos e pequenos Estados insulares em desenvolvimento",
            indicators = listOf(
                Indicator(title = "4.c.1", description = "Proporção de professores qualificados no ensino básico por nível de ensino")
            )
        )
    )

    val objective5Metas = listOf(
        Meta(
            id = 39,
            title = "Meta 5.1",
            description = "Acabar com todas as formas de discriminação contra todas as mulheres e meninas, em toda a parte",
            indicators = listOf(
                Indicator(title = "5.1.1", description = "Existência de quadros legais para promover, fazer cumprir e monitorizar a igualdade e a não-discriminação com base no género")
            )
        ),
        Meta(
            id = 40,
            title = "Meta 5.2",
            description = "Eliminar todas as formas de violência contra todas as mulheres e meninas nas esferas públicas e privadas, incluindo o tráfico, a exploração sexual e outros tipos de exploração",
            indicators = listOf(
                Indicator(title = "5.2.1", description = "Proporção de mulheres e raparigas de 15 anos de idade ou mais que foram objeto de violência física, sexual ou psicológica por um parceiro actual ou ex-parceiro nos últimos 12 meses, por forma de violência e por idade"),
                Indicator(title = "5.2.2", description = "Proporção de mulheres e raparigas de 15 anos ou mais que foram objeto de violência sexual por outras pessoas que não parceiras íntimas nos últimos 12 meses, por idade e local de ocorrência")
            )
        ),
        Meta(
            id = 41,
            title = "Meta 5.3",
            description = "Eliminar todas as práticas nocivas, como os casamentos prematuros, forçados e envolvendo crianças, bem como as mutilações genitais femininas",
            indicators = listOf(
                Indicator(title = "5.3.1", description = "Proporção de mulheres com idade de 20 a 24 anos que casaram ou viveram em união de facto antes dos 15 anos e antes dos 18 anos"),
                Indicator(title = "5.3.2", description = "Proporção de raparigas e mulheres com idade entre 15 e 49 anos que foram submetidas a mutilação genital feminina, por grupo etário")
            )
        ),
        Meta(
            id = 42,
            title = "Meta 5.4",
            description = "Reconhecer e valorizar o trabalho de assistência e doméstico não remunerado, por meio da disponibilização de serviços públicos, infraestruturas e políticas de proteção social, bem como a promoção da responsabilidade partilhada dentro do lar e da família, conforme os contextos nacionais",
            indicators = listOf(
                Indicator(title = "5.4.1", description = "Proporção de tempo gasto em trabalho doméstico e em prestação de cuidados não pagos, por sexo, grupo etário e localização")
            )
        ),
        Meta(
            id = 43,
            title = "Meta 5.5",
            description = "Garantir a participação plena e efetiva das mulheres e a igualdade de oportunidades para a liderança em todos os níveis de tomada de decisão na vida política, económica e pública",
            indicators = listOf(
                Indicator(title = "5.5.1", description = "Proporção de assentos parlamentares detidos por mulheres (a) nos parlamentos nacionais e (b) governos locais"),
                Indicator(title = "5.5.2", description = "Proporção de mulheres em cargos de chefia")
            )
        ),
        Meta(
            id = 44,
            title = "Meta 5.6",
            description = "Assegurar o acesso universal à saúde sexual e reprodutiva e os direitos reprodutivos, em conformidade com o Programa de Ação da Conferência Internacional sobre População e Desenvolvimento e com a Plataforma de Ação de Pequim e os documentos resultantes das suas conferências de revisão",
            indicators = listOf(
                Indicator(title = "5.6.1", description = "Proporção de mulheres com idade entre 15 e 49 anos que decidem de forma informada sobre a sua vida sexual, uso de contracetivos e saúde reprodutiva"),
                Indicator(title = "5.6.2", description = "Número de países com legislação e regulamentação que garante o acesso pleno e igualitário por mulheres e homens com 15 ou mais anos a informação, educação e cuidados de saúde sexual e reprodutiva")
            )
        ),
        Meta(
            id = 45,
            title = "Meta 5.a",
            description = "Realizar reformas para dar às mulheres direitos iguais aos recursos económicos, bem como o acesso à propriedade e controlo sobre a terra e outras formas de propriedade, aos serviços financeiros, à herança e aos recursos naturais, de acordo com as leis nacionais",
            indicators = listOf(
                Indicator(title = "5.a.1", description = "(a) Proporção da população agrícola proprietária ou com direitos de posse das terras agrícolas, por sexo; e (b) proporção de mulheres entre os proprietários ou detentores de direitos de posse das terras agrícolas, por forma de exploração das terras agrícolas"),
                Indicator(title = "5.a.2", description = "Proporção de países onde o quadro jurídico (incluindo o direito consuetudinário) garante às mulheres direitos iguais à propriedade e/ou controlo da terra")
            )
        ),
        Meta(
            id = 46,
            title = "Meta 5.b",
            description = "Aumentar o uso de tecnologias de base, em particular as tecnologias de informação e comunicação, para promover a capacitação das mulheres",
            indicators = listOf(
                Indicator(title = "5.b.1", description = "Proporção de pessoas com disponibilidade de telemóvel, por sexo")
            )
        ),
        Meta(
            id = 47,
            title = "Meta 5.c",
            description = "Adotar e fortalecer políticas sólidas e legislação aplicável para a promoção da igualdade de género e a capacitação de todas as mulheres e meninas, a todos os níveis",
            indicators = listOf(
                Indicator(title = "5.c.1", description = "Proporção de países com sistemas de monitorização e divulgação pública das dotações disponíveis para a igualdade de género e a capacitação das mulheres")
            )
        )
    )

    // Objetivo 6
    val objective6Metas = listOf(
        Meta(
            id = 48,
            title = "Meta 6.1",
            description = "Até 2030, alcançar o acesso universal e equitativo à água potável para todos, a preços acessíveis",
            indicators = listOf(
                Indicator(title = "6.1.1", description = "Proporção da população que utiliza serviços de água potável")
            )
        ),
        Meta(
            id = 49,
            title = "Meta 6.2",
            description = "Até 2030, alcançar o acesso a saneamento e higiene adequados e equitativos para todos, e acabar com a defecação a céu aberto, com especial atenção para as necessidades das mulheres e meninas e daqueles que estão em situação de vulnerabilidade",
            indicators = listOf(
                Indicator(title = "6.2.1", description = "Proporção da população que utiliza (a) serviços de saneamento seguros e (b) instalação de lavagem das mãos com água e sabão")
            )
        ),
        Meta(
            id = 50,
            title = "Meta 6.3",
            description = "Até 2030, melhorar a qualidade da água, reduzindo a poluição, eliminando despejo e minimizando a libertação de produtos químicos e materiais perigosos, reduzindo para metade a proporção de águas residuais não-tratadas e aumentando substancialmente a reciclagem e a reutilização, a nível global",
            indicators = listOf(
                Indicator(title = "6.3.1", description = "Proporção do fluxo de águas residuais domésticas e industriais tratada com segurança"),
                Indicator(title = "6.3.2", description = "Proporção de massas de água com boa qualidade ambiental")
            )
        ),
        Meta(
            id = 51,
            title = "Meta 6.4",
            description = "Até 2030, aumentar substancialmente a eficiência no uso da água em todos os setores e assegurar extrações sustentáveis e o abastecimento de água doce para enfrentar a escassez de água, e reduzir substancialmente o número de pessoas que sofrem com a escassez de água",
            indicators = listOf(
                Indicator(title = "6.4.1", description = "Alteração da eficiência no uso da água"),
                Indicator(title = "6.4.2", description = "Nível de stress hídrico: proporção das descargas de água doce no total dos recursos de água doce disponíveis")
            )
        ),
        Meta(
            id = 52,
            title = "Meta 6.5",
            description = "Até 2030, implementar a gestão integrada dos recursos hídricos, a todos os níveis, inclusive via cooperação transfronteiriça, conforme apropriado",
            indicators = listOf(
                Indicator(title = "6.5.1", description = "Grau de gestão integrada de recursos hídricos"),
                Indicator(title = "6.5.2", description = "Proporção de bacias hidrográficas transfronteiriças abrangidas por um acordo operacional de cooperação em matéria de recursos hídricos")
            )
        ),
        Meta(
            id = 53,
            title = "Meta 6.6",
            description = "Até 2020, proteger e restaurar ecossistemas relacionados com a água, incluindo montanhas, florestas, zonas húmidas, rios, aquíferos e lagos",
            indicators = listOf(
                Indicator(title = "6.6.1", description = "Alteração na extensão dos ecossistemas aquáticos ao longo do tempo")
            )
        ),
        Meta(
            id = 54,
            title = "Meta 6.a",
            description = "Até 2030, ampliar a cooperação internacional e o apoio à capacitação para os países em desenvolvimento em atividades e programas relacionados com a água e o saneamento, incluindo extração de água, dessalinização, eficiência no uso da água, tratamento de efluentes, reciclagem e tecnologias de reutilização",
            indicators = listOf(
                Indicator(title = "6.a.1", description = "Montante de ajuda pública ao desenvolvimento na área da água e saneamento, inserida num plano governamental de despesa")
            )
        ),
        Meta(
            id = 55,
            title = "Meta 6.b",
            description = "Apoiar e fortalecer a participação das comunidades locais, para melhorar a gestão da água e do saneamento",
            indicators = listOf(
                Indicator(title = "6.b.1", description = "Proporção de municípios com políticas e procedimentos estabelecidos e operacionais para a participação das comunidades locais na gestão de água e saneamento")
            )
        )
    )

    // Objetivo 7
    val objective7Metas = listOf(
        Meta(
            id = 56,
            title = "Meta 7.1",
            description = "Até 2030, assegurar o acesso universal a serviços de energia modernos, fiáveis e a preços acessíveis",
            indicators = listOf(
                Indicator(title = "7.1.1", description = "Percentagem da população com acesso à eletricidade"),
                Indicator(title = "7.1.2", description = "Percentagem da população com acesso primário a combustíveis e tecnologias limpas")
            )
        ),
        Meta(
            id = 57,
            title = "Meta 7.2",
            description = "Até 2030, aumentar substancialmente a participação de energias renováveis na matriz energética global",
            indicators = listOf(
                Indicator(title = "7.2.1", description = "Peso das energias renováveis no consumo total final de energia")
            )
        ),
        Meta(
            id = 58,
            title = "Meta 7.3",
            description = "Até 2030, duplicar a taxa global de melhoria da eficiência energética",
            indicators = listOf(
                Indicator(title = "7.3.1", description = "Intensidade energética medida em termos de energia primária e de PIB")
            )
        ),
        Meta(
            id = 59,
            title = "Meta 7.a",
            description = "Até 2030, reforçar a cooperação internacional para facilitar o acesso às tecnologias e investigação sobre energias limpas, incluindo energias renováveis, eficiência energética e tecnologias de combustíveis fósseis avançadas e mais limpas, e promover o investimento em infraestrutura de energia e em tecnologias de energia limpa",
            indicators = listOf(
                Indicator(title = "7.a.1", description = "Fluxos financeiros internacionais para países em desenvolvimento para apoio à pesquisa e desenvolvimento de energias limpas e à produção de energia renovável, incluindo sistemas híbridos")
            )
        ),
        Meta(
            id = 60,
            title = "Meta 7.b",
            description = "Até 2030, expandir a infraestrutura e modernizar a tecnologia para o fornecimento de serviços de energia modernos e sustentáveis para todos nos países em desenvolvimento, particularmente nos países menos desenvolvidos, nos pequenos Estados insulares em desenvolvimento e nos países em desenvolvimento sem litoral, de acordo com os seus respetivos programas de apoio",
            indicators = listOf(
                Indicator(title = "7.b.1", description = "Capacidade instalada de geração de energia renovável nos países em desenvolvimento (em Watts per capita)")
            )
        )
    )
    val objective8Metas = listOf(
        Meta(
            id = 61,
            title = "Meta 8.1",
            description = "Sustentar o crescimento económico per capita de acordo com as circunstâncias nacionais e, em particular, um crescimento anual de pelo menos 7% do Produto Interno Bruto (PIB) nos países menos desenvolvidos",
            indicators = listOf(
                Indicator(title = "8.1.1", description = "Taxa de variação anual do PIB real per capita")
            )
        ),
        Meta(
            id = 62,
            title = "Meta 8.2",
            description = "Atingir níveis mais elevados de produtividade das economias através da diversificação, modernização tecnológica e inovação, nomeadamente através da aposta em setores de alto valor acrescentado e dos setores de mão-de-obra intensiva",
            indicators = listOf(
                Indicator(title = "8.2.1", description = "Taxa de variação anual do PIB real por pessoa empregada")
            )
        ),
        Meta(
            id = 63,
            title = "Meta 8.3",
            description = "Promover políticas orientadas para o desenvolvimento que apoiem as atividades produtivas, criação de emprego decente, empreendedorismo, criatividade e inovação, e incentivar a formalização e o crescimento das micro, pequenas e médias empresas, inclusive através do acesso aos serviços financeiros",
            indicators = listOf(
                Indicator(title = "8.3.1", description = "Proporção do emprego informal no emprego total, por sector e por sexo")
            )
        ),
        Meta(
            id = 64,
            title = "Meta 8.4",
            description = "Melhorar progressivamente, até 2030, a eficiência dos recursos globais no consumo e na produção, e procurar ativamente dissociar crescimento económico da degradação ambiental, de acordo com o enquadramento decenal de programas sobre produção e consumo sustentáveis, com os países desenvolvidos na liderança",
            indicators = listOf(
                Indicator(title = "8.4.1", description = "Pegada material, pegada material per capita e pegada material em percentagem do PIB"),
                Indicator(title = "8.4.2", description = "Consumo interno de materiais, consumo interno de materiais per capita e consumo interno de materiais por unidade do PIB")
            )
        ),
        Meta(
            id = 65,
            title = "Meta 8.5",
            description = "Até 2030, alcançar o emprego pleno e produtivo, e trabalho decente para todas as mulheres e homens, inclusive para os jovens e as pessoas com deficiência, e remuneração igual para trabalho de igual valor",
            indicators = listOf(
                Indicator(title = "8.5.1", description = "Ganho médio horário dos trabalhadores por conta de outrem, por sexo, grupo etário, profissão e população com incapacidade"),
                Indicator(title = "8.5.2", description = "Taxa de desemprego, por sexo, grupo etário e população com incapacidade")
            )
        ),
        Meta(
            id = 66,
            title = "Meta 8.6",
            description = "Até 2020, reduzir substancialmente a proporção de jovens não empregados que não estão em educação ou formação",
            indicators = listOf(
                Indicator(title = "8.6.1", description = "Taxa de jovens (dos 15 aos 24 anos) não empregados que não estão em educação ou formação")
            )
        ),
        Meta(
            id = 67,
            title = "Meta 8.7",
            description = "Tomar medidas imediatas e eficazes para erradicar o trabalho forçado, acabar com a escravidão moderna e o tráfico de pessoas, e assegurar a proibição e a eliminação das piores formas de trabalho infantil, incluindo recrutamento e utilização de crianças-soldado, e até 2025 acabar com o trabalho infantil em todas as suas formas",
            indicators = listOf(
                Indicator(title = "8.7.1", description = "Proporção e número de crianças dos 5 aos 17 anos em trabalho infantil, por sexo e idade")
            )
        ),
        Meta(
            id = 68,
            title = "Meta 8.8",
            description = "Proteger os direitos do trabalho e promover ambientes de trabalho seguros e protegidos para todos os trabalhadores, incluindo os trabalhadores migrantes, em particular as mulheres migrantes, e pessoas em empregos precários",
            indicators = listOf(
                Indicator(title = "8.8.1", description = "Acidentes de trabalho mortais e não mortais por 100 mil trabalhadores, por sexo e condição de migração"),
                Indicator(title = "8.8.2", description = "Nível de cumprimento nacional dos direitos laborais (liberdade de associação e de negociação coletiva) emanados da Organização Internacional do Trabalho (OIT) e da legislação nacional, por sexo e condição de migração")
            )
        ),
        Meta(
            id = 69,
            title = "Meta 8.9",
            description = "Até 2030, elaborar e implementar políticas para promover o turismo sustentável, que cria emprego e promove a cultura e os produtos locais",
            indicators = listOf(
                Indicator(title = "8.9.1", description = "Turismo em percentagem do PIB e taxa de variação")
            )
        ),
        Meta(
            id = 70,
            title = "Meta 8.10",
            description = "Fortalecer a capacidade das instituições financeiras nacionais para incentivar a expansão do acesso aos serviços bancários, de seguros e financeiros para todos",
            indicators = listOf(
                Indicator(title = "8.10.1", description = "(a) Número de agências bancárias por 100 000 adultos e (b) número de postos de multibanco (ATM) por 100 000 adultos"),
                Indicator(title = "8.10.2", description = "Proporção de adultos (15 ou mais anos) com uma conta num banco ou em outra instituição financeira ou com um serviço móvel de dinheiro")
            )
        ),
        Meta(
            id = 71,
            title = "Meta 8.a",
            description = "Aumentar o apoio à Iniciativa de Ajuda para o Comércio [Aid for Trade] para os países em desenvolvimento, particularmente os países menos desenvolvidos, inclusive através do Quadro Integrado Reforçado para a Assistência Técnica Relacionada com o Comércio para os países menos desenvolvidos",
            indicators = listOf(
                Indicator(title = "8.a.1", description = "Compromissos e desembolsos no âmbito da Iniciativa de Ajuda ao Comércio")
            )
        ),
        Meta(
            id = 72,
            title = "Meta 8.b",
            description = "Até 2020, desenvolver e operacionalizar uma estratégia global para o emprego dos jovens e implementar o Pacto Mundial para o Emprego da Organização Internacional do Trabalho (OIT)",
            indicators = listOf(
                Indicator(title = "8.b.1", description = "Existência de uma estratégia nacional desenvolvida e operacionalizada para o emprego dos jovens, como estratégia distinta ou como parte de uma estratégia nacional para o emprego")
            )
        )
    )

    // Objetivo 9
    val objective9Metas = listOf(
        Meta(
            id = 73,
            title = "Meta 9.1",
            description = "Desenvolver infraestruturas de qualidade, fiáveis, sustentáveis e resilientes, incluindo infraestruturas regionais e transfronteiriças, para apoiar o desenvolvimento económico e o bem-estar humano, focando o acesso equitativo e a preços acessíveis para todos",
            indicators = listOf(
                Indicator(title = "9.1.1", description = "Proporção de população residente em áreas rurais que vive num raio de 2 km de acesso a uma estrada transitável em todas as estações do ano"),
                Indicator(title = "9.1.2", description = "Passageiros e carga transportados por modos de transporte")
            )
        ),
        Meta(
            id = 74,
            title = "Meta 9.2",
            description = "Promover a industrialização inclusiva e sustentável e, até 2030, aumentar significativamente a parcela da indústria no setor do emprego e no PIB, de acordo com as circunstâncias nacionais, e duplicar a sua parcela nos países menos desenvolvidos",
            indicators = listOf(
                Indicator(title = "9.2.1", description = "Valor acrescentado da indústria transformadora em percentagem do PIB e per capita"),
                Indicator(title = "9.2.2", description = "Emprego da indústria transformadora em percentagem do emprego total")
            )
        ),
        Meta(
            id = 75,
            title = "Meta 9.3",
            description = "Aumentar o acesso das pequenas indústrias e outras empresas, particularmente em países em desenvolvimento, aos serviços financeiros, incluindo ao crédito acessível e à sua integração em cadeias de valor e mercados",
            indicators = listOf(
                Indicator(title = "9.3.1", description = "Proporção do valor acrescentado bruto das micro empresas industriais no total da indústria"),
                Indicator(title = "9.3.2", description = "Proporção de micro empresas industriais com empréstimos contraídos ou linhas de crédito")
            )
        ),
        Meta(
            id = 76,
            title = "Meta 9.4",
            description = "Até 2030, modernizar as infraestruturas e reabilitar as indústrias para torná-las sustentáveis, com maior eficiência no uso de recursos e maior adoção de tecnologias e processos industriais limpos e ambientalmente corretos; com todos os países atuando de acordo com as suas respetivas capacidades",
            indicators = listOf(
                Indicator(title = "9.4.1", description = "Emissão de CO2 por unidade de valor acrescentado")
            )
        ),
        Meta(
            id = 77,
            title = "Meta 9.5",
            description = "Fortalecer a investigação científica, melhorar as capacidades tecnológicas de setores industriais em todos os países, particularmente os países em desenvolvimento, inclusive, até 2030, incentivar a inovação e aumentar substancialmente o número de trabalhadores na área de investigação e desenvolvimento por milhão de pessoas e a despesa pública e privada em investigação e desenvolvimento",
            indicators = listOf(
                Indicator(title = "9.5.1", description = "Despesas de investigação e desenvolvimento em percentagem do PIB"),
                Indicator(title = "9.5.2", description = "Investigadores (em Equivalente a Tempo Completo) por milhão de habitantes")
            )
        ),
        Meta(
            id = 78,
            title = "Meta 9.a",
            description = "Facilitar o desenvolvimento de infraestruturas sustentáveis e resilientes nos países em desenvolvimento, através de maior apoio financeiro, tecnológico e técnico aos países africanos, aos países menos desenvolvidos, aos países em desenvolvimento sem litoral e aos pequenos Estados insulares em desenvolvimento",
            indicators = listOf(
                Indicator(title = "9.a.1", description = "Total de apoio internacional oficial (ajuda pública ao desenvolvimento e outros fluxos oficiais) à infraestrutura")
            )
        ),
        Meta(
            id = 79,
            title = "Meta 9.b",
            description = "Apoiar o desenvolvimento tecnológico, a investigação e a inovação nos países em desenvolvimento, incluindo garantir um ambiente político propício para, inter alia, a diversificação industrial e adicionar valor às matérias-primas",
            indicators = listOf(
                Indicator(title = "9.b.1", description = "Peso do valor acrescentado das indústrias de média e alta tecnologia no valor acrescentado total")
            )
        ),
        Meta(
            id = 80,
            title = "Meta 9.c",
            description = "Aumentar significativamente o acesso às tecnologias de informação e comunicação e envidar esforços para oferecer acesso universal e a preços acessíveis à internet nos países menos desenvolvidos, até 2020",
            indicators = listOf(
                Indicator(title = "9.c.1", description = "Proporção da população coberta por rede móvel, por tipo de tecnologia")
            )
        )
    )

    // Objetivo 10
    val objective10Metas = listOf(
        Meta(
            id = 81,
            title = "Meta 10.1",
            description = "Até 2030, progressivamente alcançar, e manter de forma sustentável, o crescimento do rendimento dos 40% da população mais pobre a um ritmo maior do que o da média nacional",
            indicators = listOf(
                Indicator(title = "10.1.1", description = "Taxa de crescimento das despesas das famílias ou rendimento per capita entre os 40% da população com menores recursos e a população total")
            )
        ),
        Meta(
            id = 82,
            title = "Meta 10.2",
            description = "Até 2030, capacitar e promover a inclusão social, económica e política de todos, independentemente da idade, género, incapacidade, etnia, origem, religião, condição económica ou outra",
            indicators = listOf(
                Indicator(title = "10.2.1", description = "Proporção de pessoas que vivem em agregados familiares com um rendimento inferior a 50% do rendimento mediano, por sexo, grupo etário e população com incapacidade")
            )
        ),
        Meta(
            id = 83,
            title = "Meta 10.3",
            description = "Garantir a igualdade de oportunidades e reduzir as desigualdades de resultados, inclusive através da eliminação de leis, políticas e práticas discriminatórias e da promoção de legislação, políticas e ações adequadas a este respeito",
            indicators = listOf(
                Indicator(title = "10.3.1", description = "Proporção da população que reportou ter-se sentido pessoalmente discriminada ou assediada nos últimos 12 meses por motivos de discriminação proibidos no âmbito da legislação internacional dos direitos humanos")
            )
        ),
        Meta(
            id = 84,
            title = "Meta 10.4",
            description = "Adotar políticas, especialmente ao nível fiscal, salarial e de proteção social, e alcançar progressivamente uma maior igualdade",
            indicators = listOf(
                Indicator(title = "10.4.1", description = "Proporção do trabalho no PIB"),
                Indicator(title = "10.4.2", description = "Impacto redistributivo da política fiscal")
            )
        ),
        Meta(
            id = 85,
            title = "Meta 10.5",
            description = "Melhorar a regulamentação e monitorização dos mercados e instituições financeiras globais e fortalecer a implementação de tais regulamentações",
            indicators = listOf(
                Indicator(title = "10.5.1", description = "Indicadores de Solidez Financeira")
            )
        ),
        Meta(
            id = 86,
            title = "Meta 10.6",
            description = "Assegurar uma representação e voz mais forte dos países em desenvolvimento em tomadas de decisão nas instituições económicas e financeiras internacionais globais, a fim de produzir instituições mais eficazes, credíveis, responsáveis e legítimas",
            indicators = listOf(
                Indicator(title = "10.6.1", description = "Proporção de membros e direito de voto dos países em desenvolvimento em organizações internacionais")
            )
        ),
        Meta(
            id = 87,
            title = "Meta 10.7",
            description = "Facilitar a migração e a mobilidade das pessoas de forma ordenada, segura, regular e responsável, inclusive através da implementação de políticas de migração planeadas e bem geridas",
            indicators = listOf(
                Indicator(title = "10.7.1", description = "Custo de recrutamento suportado pelo empregado em proporção do rendimento mensal auferido no país de destino"),
                Indicator(title = "10.7.2", description = "Número de países com políticas de migração que facilitam a migração e a mobilidade de pessoas ordenada, segura, regular e responsável"),
                Indicator(title = "10.7.3", description = "Número de migrantes mortos ao tentar atravessar fronteiras marítimas, terrestres e aéreas"),
                Indicator(title = "10.7.4", description = "Proporção da população refugiada, por país de origem")
            )
        ),
        Meta(
            id = 88,
            title = "Meta 10.a",
            description = "Implementar o princípio do tratamento especial e diferenciado para países em desenvolvimento, em particular para os países menos desenvolvidos, em conformidade com os acordos da Organização Mundial do Comércio",
            indicators = listOf(
                Indicator(title = "10.a.1", description = "Proporção de posições pautais aplicadas às importações provenientes dos países menos desenvolvidos e dos países em desenvolvimento com taxa zero")
            )
        ),
        Meta(
            id = 89,
            title = "Meta 10.b",
            description = "Incentivar a ajuda pública ao desenvolvimento e fluxos financeiros, incluindo o investimento externo direto, para os Estados onde a necessidade é maior, em particular os países menos desenvolvidos, os países africanos, os pequenos Estados insulares em desenvolvimento e os países em desenvolvimento sem litoral, de acordo com os seus planos e programas nacionais",
            indicators = listOf(
                Indicator(title = "10.b.1", description = "Total de fluxos de recursos para o desenvolvimento, por beneficiário e país doador, e tipo de fluxo (ex. ajuda pública ao desenvolvimento, investimento direto estrangeiro e outros fluxos)")
            )
        ),
        Meta(
            id = 90,
            title = "Meta 10.c",
            description = "Até 2030, reduzir para menos de 3% os custos de transação de remessas dos migrantes e eliminar os mecanismos de remessas com custos superiores a 5%",
            indicators = listOf(
                Indicator(title = "10.c.1", description = "Custos das remessas em proporção do valor remitido")
            )
        )
    )
    val objective11Metas = listOf(
        Meta(
            id = 91,
            title = "Meta 11.1",
            description = "Até 2030, garantir o acesso de todos à habitação segura, adequada e a preço acessível, e aos serviços básicos, e melhorar as condições nos bairros de lata",
            indicators = listOf(
                Indicator(title = "11.1.1", description = "Proporção de população residente em áreas urbanas que vive em alojamentos não clássicos ou em alojamentos com falta de condições de habitação")
            )
        ),
        Meta(
            id = 92,
            title = "Meta 11.2",
            description = "Até 2030, proporcionar o acesso a sistemas de transporte seguros, acessíveis, sustentáveis e a preço acessível para todos, melhorando a segurança rodoviária através da expansão da rede de transportes públicos, com especial atenção para as necessidades das pessoas em situação de vulnerabilidade, mulheres, crianças, pessoas com deficiência e idosos",
            indicators = listOf(
                Indicator(title = "11.2.1", description = "Proporção de população com acesso adequado a transportes públicos, por sexo, grupo etário e população com incapacidade")
            )
        ),
        Meta(
            id = 93,
            title = "Meta 11.3",
            description = "Até 2030, aumentar a urbanização inclusiva e sustentável, e as capacidades para um ordenamento do povoamento humano participativo, integrado e sustentável, em todos os países",
            indicators = listOf(
                Indicator(title = "11.3.1", description = "Rácio entre a taxa de consumo do solo e a taxa de crescimento da população"),
                Indicator(title = "11.3.2", description = "Proporção de cidades com uma estrutura de participação direta da sociedade civil no planeamento e gestão urbana que opera de forma regular e democrática")
            )
        ),
        Meta(
            id = 94,
            title = "Meta 11.4",
            description = "Fortalecer esforços para proteger e salvaguardar o património cultural e natural do mundo",
            indicators = listOf(
                Indicator(title = "11.4.1", description = "Total da despesa (pública e privada) per capita gasta na preservação, proteção e conservação de todo o património cultural e natural, por tipo de património (cultural, natural, misto e por designação do Centro do Património Mundial), nível de governo (nacional, regional e local), tipo de despesa (despesas correntes / de investimento) e tipo de financiamento privado (doações em espécie, sector privado sem fins lucrativos e patrocínios)")
            )
        ),
        Meta(
            id = 95,
            title = "Meta 11.5",
            description = "Até 2030, reduzir significativamente o número de mortes e o número de pessoas afetadas por catástrofes e diminuir substancialmente as perdas económicas diretas causadas por essa via no produto interno bruto global, incluindo as catástrofes relacionadas com a água, focando-se sobretudo na proteção dos pobres e das pessoas em situação de vulnerabilidade",
            indicators = listOf(
                Indicator(title = "11.5.1", description = "Número de mortes, pessoas desaparecidas e pessoas diretamente afetadas devido a catástrofes por 100 mil habitantes"),
                Indicator(title = "11.5.2", description = "Perdas económicas diretas atribuídas a desastres em relação ao Produto Interno Bruto (PIB) global"),
                Indicator(title = "11.5.3", description = "(a) Danos em infraestruturas críticas e (b) número de interrupções de serviços básicos, causados ​​por desastres")
            )
        ),
        Meta(
            id = 96,
            title = "Meta 11.6",
            description = "Até 2030, reduzir o impacto ambiental negativo per capita nas cidades, incluindo prestar especial atenção à qualidade do ar, à gestão de resíduos municipais e de outros resíduos",
            indicators = listOf(
                Indicator(title = "11.6.1", description = "Proporção de resíduos sólidos municipais coletados e geridos em instalações controladas no total de resíduos municipais gerados, por cidades"),
                Indicator(title = "11.6.2", description = "Nível médio anual de partículas inaláveis (ex: com diâmetro inferior a 2,5 µm e 10 µm) nas cidades (população ponderada)")
            )
        ),
        Meta(
            id = 97,
            title = "Meta 11.7",
            description = "Até 2030, proporcionar o acesso universal a espaços públicos seguros, inclusivos, acessíveis e verdes, particularmente para as mulheres e crianças, pessoas idosas e pessoas com deficiência",
            indicators = listOf(
                Indicator(title = "11.7.1", description = "Proporção de espaço aberto para uso público de todos nas cidades, por sexo, grupo etário e população com incapacidade"),
                Indicator(title = "11.7.2", description = "Proporção da população vítima de assédio físico ou sexual, por sexo, grupo etário, incapacidade e local da ocorrência, nos últimos 12 meses")
            )
        ),
        Meta(
            id = 98,
            title = "Meta 11.a",
            description = "Apoiar relações económicas, sociais e ambientais positivas entre áreas urbanas, periurbanas e rurais, reforçando o planeamento nacional e regional de desenvolvimento",
            indicators = listOf(
                Indicator(title = "11.a.1", description = "Número de países que têm políticas urbanas nacionais ou planos de desenvolvimento regional que (a) respondem à dinâmica populacional, (b) asseguram um desenvolvimento territorial equilibrado, (c) aumentam o espaço fiscal local")
            )
        ),
        Meta(
            id = 99,
            title = "Meta 11.b",
            description = "Até 2020, aumentar substancialmente o número de cidades e povoamentos humanos que adotaram e implementaram políticas e planos integrados para a inclusão, a eficiência dos recursos, mitigação e adaptação às mudanças climáticas, resiliência a desastres; e desenvolver e implementar, de acordo com o Quadro de Sendai para a Redução do Risco de Catástrofes 2015-2030, a gestão holística do risco de desastres, a todos os níveis",
            indicators = listOf(
                Indicator(title = "11.b.1", description = "Número de países que adotaram e implementaram estratégias nacionais de redução de risco de desastres em linha com o Quadro de Sendai para a Redução de Risco de Desastres 2015-2030"),
                Indicator(title = "11.b.2", description = "Proporção de governos locais que adotaram e implementaram estratégias locais de redução de risco de desastres em linha com as estratégias nacionais de redução de risco de desastres")
            )
        ),
        Meta(
            id = 100,
            title = "Meta 11.c",
            description = "Apoiar os países menos desenvolvidos, inclusive por meio de assistência técnica e financeira, para construções sustentáveis e resilientes, utilizando materiais locais",
            indicators = listOf(
                Indicator(title = "11.c.1", description = "Proporção de edifícios que utilizam materiais locais e técnicas de construção sustentáveis nos países menos desenvolvidos")
            )
        )
    )
    val objective12Metas = listOf(
        Meta(
            id = 101,
            title = "Meta 12.1",
            description = "Implementar o Plano Decenal de Programas sobre Produção e Consumo Sustentáveis, com todos os países a tomar medidas, e os países desenvolvidos assumindo a liderança, tendo em conta o desenvolvimento e as capacidades dos países em desenvolvimento",
            indicators = listOf(
                Indicator(title = "12.1.1", description = "Número de países que desenvolvem, adotam ou implementam instrumentos políticos destinados a apoiar a mudança para o consumo e produção sustentáveis")
            )
        ),
        Meta(
            id = 102,
            title = "Meta 12.2",
            description = "Até 2030, alcançar a gestão sustentável e o uso eficiente dos recursos naturais",
            indicators = listOf(
                Indicator(title = "12.2.1", description = "Pegada material, pegada material per capita e pegada material em percentagem do PIB"),
                Indicator(title = "12.2.2", description = "Consumo interno de materiais, consumo interno de materiais per capita e consumo interno de materiais por unidade do PIB")
            )
        ),
        Meta(
            id = 103,
            title = "Meta 12.3",
            description = "Até 2030, reduzir para metade, à escala global, o desperdício de alimentos per capita, tanto a nível de retalhistas como de consumidores, e reduzir os desperdícios de alimentos ao longo das cadeias de produção e abastecimento, incluindo os que ocorrem pós-colheita",
            indicators = listOf(
                Indicator(title = "12.3.1", description = "(a) Índice de perdas alimentares e (b) índice de desperdício alimentar")
            )
        ),
        Meta(
            id = 104,
            title = "Meta 12.4",
            description = "Até 2020, alcançar a gestão ambientalmente correta dos produtos químicos e de todos os resíduos, ao longo de todo o seu ciclo de vida, de acordo com os quadros internacionais acordados, e reduzir significativamente a sua libertação para o ar, água e solo, de modo a minimizar os seus impactos negativos sobre a saúde humana e o meio ambiente",
            indicators = listOf(
                Indicator(title = "12.4.1", description = "Número de parceiros em acordos multilaterais internacionais sobre resíduos perigosos e outros produtos químicos, no domínio do ambiente, que cumpram os seus compromissos e obrigações na transmissão de informações, conforme exigido por cada acordo relevante"),
                Indicator(title = "12.4.2", description = "(a) Quantidade de resíduos perigosos gerados per capita e (b) proporção de resíduos perigosos tratados, por tipo de tratamento")
            )
        ),
        Meta(
            id = 105,
            title = "Meta 12.5",
            description = "Até 2030, reduzir substancialmente a produção de resíduos através da prevenção, redução, reciclagem e reutilização",
            indicators = listOf(
                Indicator(title = "12.5.1", description = "Taxa de reciclagem nacional, toneladas de material reciclado")
            )
        ),
        Meta(
            id = 106,
            title = "Meta 12.6",
            description = "Incentivar as empresas, especialmente as de grande dimensão e transnacionais, a adotar práticas sustentáveis e a integrar informação sobre sustentabilidade nos relatórios de atividade",
            indicators = listOf(
                Indicator(title = "12.6.1", description = "Número de empresas que publicam relatórios de sustentabilidade")
            )
        ),
        Meta(
            id = 107,
            title = "Meta 12.7",
            description = "Promover práticas de contratação pública sustentável, de acordo com as políticas e prioridades nacionais",
            indicators = listOf(
                Indicator(title = "12.7.1", description = "Número de países que implementam políticas e planos de ação de contratação pública sustentável")
            )
        ),
        Meta(
            id = 108,
            title = "Meta 12.8",
            description = "Até 2030, assegurar que as pessoas, em toda a parte, disponham da informação relevante e sensibilização para o desenvolvimento sustentável e estilos de vida em harmonia com a natureza",
            indicators = listOf(
                Indicator(title = "12.8.1", description = "Grau de Educação para a Cidadania Global (ECG) e Educação para o Desenvolvimento Sustentável (EDS), por país, incluindo (a) políticas nacionais de educação; (b) currículos; (c) formação de professores; e (d) avaliação de estudantes")
            )
        ),
        Meta(
            id = 109,
            title = "Meta 12.a",
            description = "Apoiar os países em desenvolvimento a fortalecer as suas capacidades científicas e tecnológicas para a mudança para padrões de consumo e produção mais sustentáveis",
            indicators = listOf(
                Indicator(title = "12.a.1", description = "Montante de apoio fornecido aos países em desenvolvimento para pesquisa e desenvolvimento em tecnologias sustentáveis e desenvolvimento de capacidades para a produção e consumo sustentáveis")
            )
        ),
        Meta(
            id = 110,
            title = "Meta 12.b",
            description = "Desenvolver e implementar ferramentas para monitorar os impactos do desenvolvimento sustentável no turismo sustentável, que cria empregos e promove a cultura e os produtos locais",
            indicators = listOf(
                Indicator(title = "12.b.1", description = "Número de ferramentas/estratégias de monitorização do turismo sustentável apoiadas ou desenvolvidas com assistência")
            )
        ),
        Meta(
            id = 111,
            title = "Meta 12.c",
            description = "Racionalizar subsídios ineficientes aos combustíveis fósseis que incentivam o consumo excessivo, eliminando distorções de mercado, de acordo com as circunstâncias nacionais, incluindo através da reestruturação tributária e eliminação gradual de subsídios prejudiciais, quando existam, para refletir os seus impactos ambientais, tendo em conta a necessidade de minimizar os impactos adversos sobre os pobres e as comunidades afetadas",
            indicators = listOf(
                Indicator(title = "12.c.1", description = "(a) Valor dos subsídios a combustíveis fósseis per capita e em percentagem do PIB e (b) proporção dos subsídios a combustíveis fósseis relativamente ao total nacional de despesa em combustíveis fósseis")
            )
        )
    )
    val objective13Metas = listOf(
        Meta(
            id = 112,
            title = "Meta 13.1",
            description = "Reforçar a resiliência e a capacidade de adaptação a riscos relacionados com o clima e as catástrofes naturais em todos os países",
            indicators = listOf(
                Indicator(title = "13.1.1", description = "Número de mortes, pessoas desaparecidas e pessoas diretamente afetadas devido a catástrofes por 100 mil habitantes"),
                Indicator(title = "13.1.2", description = "Número de países que adotaram e implementaram estratégias nacionais de redução de risco de desastres em linha com o Quadro de Sendai para a Redução de Risco de Desastres 2015-2030"),
                Indicator(title = "13.1.3", description = "Proporção de governos locais que adotam e implementam estratégias locais de redução de risco de desastres em linha com as estratégias nacionais de redução de risco de desastres")
            )
        ),
        Meta(
            id = 113,
            title = "Meta 13.2",
            description = "Integrar medidas relacionadas com alterações climáticas nas políticas, estratégias e planos nacionais",
            indicators = listOf(
                Indicator(title = "13.2.1", description = "Número de países com contribuições determinadas nacionalmente, estratégias de longo prazo, planos nacionais de adaptação, estratégias como reportadas em comunicações de adaptação e comunicações nacionais"),
                Indicator(title = "13.2.2", description = "Emissões totais de gases de efeito estufa por ano")
            )
        ),
        Meta(
            id = 114,
            title = "Meta 13.3",
            description = "Melhorar a educação, aumentar a consciencialização e a capacidade humana e institucional sobre medidas de mitigação, adaptação, redução de impacto e alerta precoce no que respeita às alterações climáticas",
            indicators = listOf(
                Indicator(title = "13.3.1", description = "Grau com que a (i) educação para a cidadania global e a (ii) educação para o desenvolvimento sustentável são disseminados em: (a) políticas educativas nacionais, (b) programas educativos, (c) formação de professores e (d) avaliação de estudantes")
            )
        ),
        Meta(
            id = 115,
            title = "Meta 13.a",
            description = "Implementar o compromisso assumido pelos países desenvolvidos na Convenção-Quadro das Nações Unidas sobre Alterações Climáticas (UNFCCC, em inglês) de mobilizarem, em conjunto, 100 mil milhões de dólares por ano, a partir de 2020, a partir de variadas fontes, de forma a responder às necessidades dos países em desenvolvimento, no contexto das ações significativas de mitigação e implementação transparente; e operacionalizar o Fundo Verde para o Clima por meio da sua capitalização o mais cedo possível",
            indicators = listOf(
                Indicator(title = "13.a.1", description = "Montantes fornecidos e mobilizados em dólares dos Estados Unidos por ano em relação ao objetivo existente de mobilização coletiva do compromisso de $100 mil milhões até 2025")
            )
        ),
        Meta(
            id = 116,
            title = "Meta 13.b",
            description = "Promover mecanismos para a criação de capacidades para o planeamento e gestão eficaz no que respeita às alterações climáticas, nos países menos desenvolvidos e pequenos Estados insulares em desenvolvimento, e que tenham um especial enfoque nas mulheres, jovens, comunidades locais e marginalizadas",
            indicators = listOf(
                Indicator(title = "13.b.1", description = "Número de países menos desenvolvidos e pequenos Estados insulares em desenvolvimento com contribuições determinadas nacionalmente, estratégias de longo prazo, planos nacionais de adaptação, estratégias como reportadas em comunicações de adaptação e comunicações nacionais")
            )
        )
    )
    val objective14Metas = listOf(
        Meta(
            id = 117,
            title = "Meta 14.1",
            description = "Até 2025, prevenir e reduzir significativamente a poluição marítima de todos os tipos, especialmente a que advém de atividades terrestres, incluindo detritos marinhos e a poluição por nutrientes",
            indicators = listOf(
                Indicator(title = "14.1.1", description = "(a) Índice de eutrofização das águas costeiras e (b) índice de densidade de resíduos plásticos flutuantes")
            )
        ),
        Meta(
            id = 118,
            title = "Meta 14.2",
            description = "Até 2020, gerir de forma sustentável e proteger os ecossistemas marinhos e costeiros para evitar impactos adversos significativos, inclusive através do reforço da sua capacidade de resiliência, e tomar medidas para a sua restauração, a fim de assegurar oceanos saudáveis e produtivos",
            indicators = listOf(
                Indicator(title = "14.2.1", description = "Número de países usando abordagens ecossistémicas na gestão de áreas marinhas")
            )
        ),
        Meta(
            id = 119,
            title = "Meta 14.3",
            description = "Minimizar e enfrentar os impactos da acidificação dos oceanos, inclusive através do reforço da cooperação científica em todos os níveis",
            indicators = listOf(
                Indicator(title = "14.3.1", description = "Acidificação do oceano (pH médio) medida num conjunto representativo de estações de amostragem")
            )
        ),
        Meta(
            id = 120,
            title = "Meta 14.4",
            description = "Até 2020, regular, efetivamente, a extração de recursos, acabar com a sobrepesca e a pesca ilegal, não reportada e não regulamentada e as práticas de pesca destrutivas, e implementar planos de gestão com base científica, para restaurar populações de peixes no menor período de tempo possível, pelo menos para níveis que possam produzir rendimento máximo sustentável, como determinado pelas suas características biológicas",
            indicators = listOf(
                Indicator(title = "14.4.1", description = "Percentagem de unidades populacionais de gestão pesqueira (stocks) dentro dos limites biológicos sustentáveis")
            )
        ),
        Meta(
            id = 121,
            title = "Meta 14.5",
            description = "Até 2020, conservar pelo menos 10% das zonas costeiras e marinhas, de acordo com a legislação nacional e internacional, e com base na melhor informação científica disponível",
            indicators = listOf(
                Indicator(title = "14.5.1", description = "Cobertura de áreas marinhas protegidas relativamente às áreas marinhas")
            )
        ),
        Meta(
            id = 122,
            title = "Meta 14.6",
            description = "Até 2020, proibir certas formas de subsídios à pesca, que contribuem para a sobrecapacidade e a sobrepesca, e eliminar os subsídios que contribuam para a pesca ilegal, não reportada e não regulamentada, e abster-se de introduzir novos subsídios desse tipo, reconhecendo que o tratamento especial e diferenciado adequado e eficaz para os países em desenvolvimento e os países menos desenvolvidos deve ser parte integrante da negociação sobre subsídios à pesca da Organização Mundial do Comércio",
            indicators = listOf(
                Indicator(title = "14.6.1", description = "Grau de implementação de instrumentos internacionais destinados ao combate da pesca ilegal, não declarada e não regulamentada")
            )
        ),
        Meta(
            id = 123,
            title = "Meta 14.7",
            description = "Até 2030, aumentar os benefícios económicos para os pequenos Estados insulares em desenvolvimento e os países menos desenvolvidos, a partir do uso sustentável dos recursos marinhos, inclusive através de uma gestão sustentável da pesca, aquicultura e turismo",
            indicators = listOf(
                Indicator(title = "14.7.1", description = "Percentagem do PIB atribuída à pesca sustentável nos pequenos Estados insulares em desenvolvimento, nos países menos desenvolvidos e em todos os países")
            )
        ),
        Meta(
            id = 124,
            title = "Meta 14.a",
            description = "Aumentar o conhecimento científico, desenvolver capacidades de investigação e transferir tecnologia marinha, tendo em conta os critérios e orientações sobre a Transferência de Tecnologia Marinha da Comissão Oceanográfica Intergovernamental, a fim de melhorar a saúde dos oceanos e aumentar a contribuição da biodiversidade marinha para o desenvolvimento dos países em desenvolvimento, em particular os pequenos Estados insulares em desenvolvimento e os países menos desenvolvidos",
            indicators = listOf(
                Indicator(title = "14.a.1", description = "Percentagem do orçamento total para a investigação atribuída à área da tecnologia marinha")
            )
        ),
        Meta(
            id = 125,
            title = "Meta 14.b",
            description = "Proporcionar o acesso dos pescadores artesanais de pequena escala aos recursos marinhos e mercados",
            indicators = listOf(
                Indicator(title = "14.b.1", description = "Grau de aplicação de um enquadramento legal/regulamentar/político/institucional que reconhece e protege o direito de acesso da pequena pesca")
            )
        ),
        Meta(
            id = 126,
            title = "Meta 14.c",
            description = "Assegurar a conservação e o uso sustentável dos oceanos e seus recursos pela implementação do direito internacional, como refletido na UNCLOS [Convenção das Nações Unidas sobre o Direito do Mar], que determina o enquadramento legal para a conservação e utilização sustentável dos oceanos e dos seus recursos, conforme registado no parágrafo 158 do “Futuro Que Queremos”",
            indicators = listOf(
                Indicator(title = "14.c.1", description = "Número de países que fizeram progressos na ratificação, aceitação e implementação, através de enquadramentos legais, de políticas e institucionais, de instrumentos relacionados com o oceano que implementam o direito internacional, tal como refletido na Convenção das Nações Unidas sobre o Direito do Mar, para a conservação e utilização sustentável dos oceanos e dos seus recursos")
            )
        )
    )
    val objective15Metas = listOf(
        Meta(
            id = 127,
            title = "Meta 15.1",
            description = "Até 2020, assegurar a conservação, recuperação e uso sustentável de ecossistemas terrestres e de água doce interior e os seus serviços, em especial florestas, zonas húmidas, montanhas e terras áridas, em conformidade com as obrigações decorrentes dos acordos internacionais",
            indicators = listOf(
                Indicator(title = "15.1.1", description = "Proporção do território que é área florestal"),
                Indicator(title = "15.1.2", description = "Proporção de sítios importantes para a biodiversidade terrestre e de água doce cobertos por áreas protegidas, por tipo de ecossistema")
            )
        ),
        Meta(
            id = 128,
            title = "Meta 15.2",
            description = "Até 2020, promover a implementação da gestão sustentável de todos os tipos de florestas, travar a deflorestação, restaurar florestas degradadas e aumentar substancialmente os esforços de florestação e reflorestação, a nível global",
            indicators = listOf(
                Indicator(title = "15.2.1", description = "Progressos para a gestão florestal sustentável")
            )
        ),
        Meta(
            id = 129,
            title = "Meta 15.3",
            description = "Até 2030, combater a desertificação, restaurar a terra e o solo degradados, incluindo terrenos afetados pela desertificação, secas e inundações, e lutar para alcançar um mundo neutro em termos de degradação do solo",
            indicators = listOf(
                Indicator(title = "15.3.1", description = "Proporção do território com solos degradados")
            )
        ),
        Meta(
            id = 130,
            title = "Meta 15.4",
            description = "Até 2030, assegurar a conservação dos ecossistemas de montanha, incluindo a sua biodiversidade, para melhorar a sua capacidade de proporcionar benefícios que são essenciais para o desenvolvimento sustentável",
            indicators = listOf(
                Indicator(title = "15.4.1", description = "Sítios importantes para a biodiversidade de montanha cobertos por áreas protegidas"),
                Indicator(title = "15.4.2", description = "Índice do coberto vegetal nas regiões de montanha")
            )
        ),
        Meta(
            id = 131,
            title = "Meta 15.5",
            description = "Tomar medidas urgentes e significativas para reduzir a degradação de habitats naturais, travar a perda de biodiversidade e, até 2020, proteger e evitar a extinção de espécies ameaçadas",
            indicators = listOf(
                Indicator(title = "15.5.1", description = "Índice das listas vermelhas")
            )
        ),
        Meta(
            id = 132,
            title = "Meta 15.6",
            description = "Garantir uma repartição justa e equitativa dos benefícios derivados da utilização dos recursos genéticos e promover o acesso adequado aos recursos genéticos",
            indicators = listOf(
                Indicator(title = "15.6.1", description = "Número de países que adotaram quadros legislativos, administrativos e políticos para assegurar a partilha justa e equitativa de benefícios")
            )
        ),
        Meta(
            id = 133,
            title = "Meta 15.7",
            description = "Tomar medidas urgentes para acabar com a caça ilegal e o tráfico de espécies da flora e fauna protegidas e agir no que respeita tanto a procura quanto a oferta de produtos ilegais da vida selvagem",
            indicators = listOf(
                Indicator(title = "15.7.1", description = "Proporção de espécimes selvagens comercializados que foi objeto de furtivismo ou traficada ilicitamente")
            )
        ),
        Meta(
            id = 134,
            title = "Meta 15.8",
            description = "Até 2020, implementar medidas para evitar a introdução e reduzir significativamente o impacto de espécies exóticas invasoras nos ecossistemas terrestres e aquáticos, e controlar ou erradicar as espécies prioritárias",
            indicators = listOf(
                Indicator(title = "15.8.1", description = "Proporção de países que adotaram legislação nacional relevante e afetaram recursos adequados para a prevenção ou o controle de espécies exóticas invasoras")
            )
        ),
        Meta(
            id = 135,
            title = "Meta 15.9",
            description = "Até 2020, integrar os valores dos ecossistemas e da biodiversidade no planeamento nacional e local, nos processos de desenvolvimento, nas estratégias de redução da pobreza e nos sistemas de contabilidade",
            indicators = listOf(
                Indicator(title = "15.9.1", description = "(a) Número de países que estabeleceram metas nacionais de acordo com ou similares à Meta 2 de Biodiversidade de Aichi, do Plano Estratégico para a Biodiversidade 2011-2020, na sua estratégia e planos de ação nacionais para a biodiversidade e o progresso monitorizado em relação a esses objetivos; e (b) integração da biodiversidade nos sistemas nacionais de contas e relatórios, definidos como a implementação do Sistema de Contas Económico-Ambientais")
            )
        ),
        Meta(
            id = 136,
            title = "Meta 15.a",
            description = "Mobilizar e aumentar significativamente, a partir de todas as fontes, os recursos financeiros para a conservação e o uso sustentável da biodiversidade e dos ecossistemas",
            indicators = listOf(
                Indicator(title = "15.a.1", description = "(a) Ajuda pública ao desenvolvimento na conservação e uso sustentável da biodiversidade; e (b) receita gerada e financiamento mobilizado a partir de instrumentos económicos relevantes para a biodiversidade")
            )
        ),
        Meta(
            id = 137,
            title = "Meta 15.b",
            description = "Mobilizar recursos significativos, a partir de todas as fontes, e a todos os níveis, para financiar a gestão florestal sustentável e proporcionar incentivos adequados aos países em desenvolvimento para promover a gestão florestal sustentável, incluindo a conservação e a reflorestação",
            indicators = listOf(
                Indicator(title = "15.b.1", description = "(a) Ajuda pública ao desenvolvimento na conservação e uso sustentável da biodiversidade; e (b) receita gerada e financiamento mobilizado a partir de instrumentos económicos relevantes para a biodiversidade")
            )
        ),
        Meta(
            id = 138,
            title = "Meta 15.c",
            description = "Reforçar o apoio global para os esforços de combate à caça ilegal e ao tráfico de espécies protegidas, inclusive através do aumento da capacidade das comunidades locais para encontrar outras oportunidades de subsistência sustentável",
            indicators = listOf(
                Indicator(title = "15.c.1", description = "Proporção de espécimes selvagens comercializados que foi objeto de furtivismo ou traficada ilicitamente")
            )
        )
    )
    val objective16Metas = listOf(
        Meta(
            id = 139,
            title = "Meta 16.1",
            description = "Reduzir significativamente todas as formas de violência e as taxas de mortalidade com ela relacionadas, em todos os lugares",
            indicators = listOf(
                Indicator(title = "16.1.1", description = "Número de vítimas de homicídio voluntário, por 100 000 habitantes, por sexo e grupo etário"),
                Indicator(title = "16.1.2", description = "Óbitos relacionados com conflitos por 100 000 habitantes, por sexo, grupo etário e causa"),
                Indicator(title = "16.1.3", description = "Proporção da população objeto de (a) violência física, (b) violência psicológica e (c) violência sexual nos últimos 12 meses"),
                Indicator(title = "16.1.4", description = "Proporção de população que se sente segura quando caminha sozinha na área onde vive depois de escurecer")
            )
        ),
        Meta(
            id = 140,
            title = "Meta 16.2",
            description = "Acabar com o abuso, exploração, tráfico e todas as formas de violência e tortura contra as crianças",
            indicators = listOf(
                Indicator(title = "16.2.1", description = "Proporção de crianças com idade entre 1 e 17 anos objeto de castigos físicos e/ou agressão psicológica por parte de cuidadores no último mês"),
                Indicator(title = "16.2.2", description = "Número de vítimas de tráfico de seres humanos por 100 000 habitantes, por sexo, grupo etário e forma de exploração"),
                Indicator(title = "16.2.3", description = "Proporção de mulheres e homens jovens com idade entre 18 e 29 anos objeto de violência sexual à idade de 18 anos")
            )
        ),
        Meta(
            id = 141,
            title = "Meta 16.3",
            description = "Promover o Estado de Direito, ao nível nacional e internacional, e garantir a igualdade de acesso à justiça para todos",
            indicators = listOf(
                Indicator(title = "16.3.1", description = "Proporção de vítimas de violência nos últimos 12 meses que reportaram às autoridades competentes ou a outros organismos de resolução de conflitos oficialmente reconhecidos"),
                Indicator(title = "16.3.2", description = "Proporção de reclusos em prisão preventiva no total de reclusos"),
                Indicator(title = "16.3.3", description = "Proporção da população que experimentou uma disputa nos últimos dois anos e que recorreu a um mecanismo formal ou informal de resolução de disputas, por tipo de mecanismo")
            )
        ),
        Meta(
            id = 142,
            title = "Meta 16.4",
            description = "Até 2030, reduzir significativamente os fluxos ilegais financeiros e de armas, reforçar a recuperação e devolução de recursos roubados e combater todas as formas de crime organizado",
            indicators = listOf(
                Indicator(title = "16.4.1", description = "Valor total de entradas e saídas de fluxos financeiros ilícitos (em dólares americanos correntes)"),
                Indicator(title = "16.4.2", description = "Proporção de armas apreendidas, encontradas ou entregues, cuja origem ou contexto ilícito tenha sido detetado ou estabelecido por uma autoridade competente, em linha com instrumentos internacionais")
            )
        ),
        Meta(
            id = 143,
            title = "Meta 16.5",
            description = "Reduzir substancialmente a corrupção e o suborno em todas as suas formas",
            indicators = listOf(
                Indicator(title = "16.5.1", description = "Proporção de pessoas que tiveram pelo menos um contacto com um funcionário público e que pagaram um suborno ou a quem foi pedido um suborno por funcionários públicos, nos últimos 12 meses"),
                Indicator(title = "16.5.2", description = "Proporção de empresas que tiveram pelo menos um contacto com um funcionário público e que pagaram um suborno ou a quem foi pedido um suborno por funcionários públicos, nos últimos 12 meses")
            )
        ),
        Meta(
            id = 144,
            title = "Meta 16.6",
            description = "Desenvolver instituições eficazes, responsáveis e transparentes, a todos os níveis",
            indicators = listOf(
                Indicator(title = "16.6.1", description = "Despesas públicas primárias como proporção do orçamento original aprovado, por setor (ou por códigos de orçamento ou similares)"),
                Indicator(title = "16.6.2", description = "Proporção da população satisfeita com a última experiência com serviços públicos")
            )
        ),
        Meta(
            id = 145,
            title = "Meta 16.7",
            description = "Garantir que a tomada de decisão, a todos os níveis, é responsável, inclusiva, participativa e representativa",
            indicators = listOf(
                Indicator(title = "16.7.1", description = "Proporções de cargos em instituições nacionais e locais, incluindo (a) órgãos legislativos; (b) serviço público; e (c) poder judiciário, face às distribuições nacionais, por sexo, grupo etário, pessoas com incapacidade e grupos populacionais"),
                Indicator(title = "16.7.2", description = "Proporção da população que considera que os processos de tomada de decisão são inclusivos e adequados, por sexo, grupo etário, incapacidade e grupo populacional")
            )
        ),
        Meta(
            id = 146,
            title = "Meta 16.8",
            description = "Ampliar e fortalecer a participação dos países em desenvolvimento nas instituições de governação global",
            indicators = listOf(
                Indicator(title = "16.8.1", description = "Proporção de membros e direito de voto dos países em desenvolvimento em organizações internacionais")
            )
        ),
        Meta(
            id = 147,
            title = "Meta 16.9",
            description = "Até 2030, fornecer identidade legal para todos, incluindo o registo de nascimento",
            indicators = listOf(
                Indicator(title = "16.9.1", description = "Proporção de crianças com menos de 5 anos com registo de nascimento numa autoridade de registo civil, por idade")
            )
        ),
        Meta(
            id = 148,
            title = "Meta 16.10",
            description = "Assegurar o acesso público à informação e proteger as liberdades fundamentais, em conformidade com a legislação nacional e os acordos internacionais",
            indicators = listOf(
                Indicator(title = "16.10.1", description = "Número de casos verificados de homicídio, rapto, desaparecimento forçado, detenção arbitrária e tortura de jornalistas, pessoal associado aos media, sindicalistas e defensores de direitos humanos nos últimos 12 meses"),
                Indicator(title = "16.10.2", description = "Número de países que adotaram e implementaram garantias constitucionais, estatutárias e/ou políticas para acesso público à informação")
            )
        ),
        Meta(
            id = 149,
            title = "Meta 16.a",
            description = "Fortalecer as instituições nacionais relevantes, inclusive através da cooperação internacional, para a construção de melhor capacidade de resposta, a todos os níveis, em particular nos países em desenvolvimento, para a prevenção da violência e o combate ao terrorismo e ao crime",
            indicators = listOf(
                Indicator(title = "16.a.1", description = "Existência de instituições nacionais independentes de direitos humanos, de acordo com os Princípios de Paris")
            )
        ),
        Meta(
            id = 150,
            title = "Meta 16.b",
            description = "Promover e fazer cumprir leis e políticas não discriminatórias para o desenvolvimento sustentável",
            indicators = listOf(
                Indicator(title = "16.b.1", description = "Proporção da população que reportou ter-se sentido pessoalmente discriminada ou assediada nos últimos 12 meses por motivos de discriminação proibidos no âmbito da legislação internacional dos direitos humanos")
            )
        )
    )
    val objective17Metas = listOf(
        Meta(
            id = 151,
            title = "Meta 17.1",
            description = "Fortalecer a mobilização de recursos internos, inclusive através do apoio internacional aos países em desenvolvimento, para melhorar a capacidade nacional de cobrança de impostos e outras fontes de receita",
            indicators = listOf(
                Indicator(title = "17.1.1", description = "Total das receitas fiscais em percentagem do PIB, por fonte"),
                Indicator(title = "17.1.2", description = "Percentagem do orçamento de Estado financiado por impostos cobrados internamente")
            )
        ),
        Meta(
            id = 152,
            title = "Meta 17.2",
            description = "Os países desenvolvidos devem implementar de forma plena os seus compromissos em matéria de ajuda pública ao desenvolvimento (APD), incluindo o compromisso de muitos países desenvolvidos de atingir a meta de 0,7% da APD/RNB para os países em desenvolvimento e de 0,15 a 0,20% da APD/RNB para os países menos desenvolvidos; os prestadores de APD são incentivados a considerar estabelecer uma meta para fornecer pelo menos 0,20% da APD/RNB aos países menos desenvolvidos",
            indicators = listOf(
                Indicator(title = "17.2.1", description = "Ajuda pública ao desenvolvimento líquida, total e para os países menos desenvolvidos, como proporção do Rendimento Nacional Bruto (RNB) dos doadores do Comité de Ajuda ao Desenvolvimento da Organização para a Cooperação e Desenvolvimento Económico (OCDE)")
            )
        ),
        Meta(
            id = 153,
            title = "Meta 17.3",
            description = "Mobilizar recursos financeiros adicionais para os países em desenvolvimento a partir de múltiplas fontes",
            indicators = listOf(
                Indicator(title = "17.3.1", description = "Recursos financeiros adicionais mobilizados para países em desenvolvimento de várias fontes"),
                Indicator(title = "17.3.2", description = "Volume de remessas (em dólares dos Estados Unidos) como proporção do PIB total")
            )
        ),
        Meta(
            id = 154,
            title = "Meta 17.4",
            description = "Ajudar os países em desenvolvimento a alcançar a sustentabilidade da dívida de longo prazo através de políticas coordenadas destinadas a promover o financiamento, a redução e a reestruturação da dívida, conforme apropriado, e abordar a questão da dívida externa dos países pobres altamente endividados de forma a reduzir o sobreendividamento",
            indicators = listOf(
                Indicator(title = "17.4.1", description = "Serviço da dívida como proporção das exportações de bens e serviços")
            )
        ),
        Meta(
            id = 155,
            title = "Meta 17.5",
            description = "Adotar e implementar regimes de promoção de investimentos para os países menos desenvolvidos",
            indicators = listOf(
                Indicator(title = "17.5.1", description = "Número de países que adotam e implementam regimes de promoção de investimentos para países em desenvolvimento, incluíndo os países menos desenvolvidos")
            )
        ),
        Meta(
            id = 156,
            title = "Meta 17.6",
            description = "Melhorar a cooperação Norte-Sul, Sul-Sul e triangular ao nível regional e internacional e o acesso à ciência, tecnologia e inovação, e aumentar a partilha de conhecimento em termos mutuamente acordados, inclusive através de uma melhor coordenação entre os mecanismos existentes, particularmente no nível das Nações Unidas, e por meio de um mecanismo de facilitação de tecnologia global",
            indicators = listOf(
                Indicator(title = "17.6.1", description = "Subscrições de Internet por banda larga de rede fixa por 100 habitantes, por velocidade de ligação")
            )
        ),
        Meta(
            id = 157,
            title = "Meta 17.7",
            description = "Promover o desenvolvimento, a transferência, a disseminação e a difusão de tecnologias ambientalmente corretas para os países em desenvolvimento, em condições favoráveis, inclusive em condições concessionais e preferenciais, conforme mutuamente acordado",
            indicators = listOf(
                Indicator(title = "17.7.1", description = "Montante total de financiamento aprovado para promover o desenvolvimento, transferência, disseminação e difusão de tecnologias ambientalmente seguras para países em desenvolvimento")
            )
        ),
        Meta(
            id = 158,
            title = "Meta 17.8",
            description = "Operacionalizar plenamente o banco de tecnologia e o mecanismo de capacitação em ciência, tecnologia e inovação para os países menos desenvolvidos até 2017, e aumentar o uso de tecnologias de capacitação, em particular das tecnologias de informação e comunicação",
            indicators = listOf(
                Indicator(title = "17.8.1", description = "Proporção de indivíduos que utilizam a Internet")
            )
        ),
        Meta(
            id = 159,
            title = "Meta 17.9",
            description = "Reforçar o apoio internacional para a implementação eficaz e orientada da capacitação em países em desenvolvimento, a fim de apoiar os planos nacionais para implementar todos os objetivos de desenvolvimento sustentável, inclusive através da cooperação Norte-Sul, Sul-Sul e triangular",
            indicators = listOf(
                Indicator(title = "17.9.1", description = "Valor, em dólares, da assistência técnica e financeira (incluindo cooperação Norte-Sul, Sul-Sul e triangular) destinada a países em desenvolvimento")
            )
        ),
        Meta(
            id = 160,
            title = "Meta 17.10",
            description = "Promover um sistema multilateral de comércio universal, baseado em regras, aberto, não discriminatório e equitativo no âmbito da Organização Mundial do Comércio (OMC), inclusive através da conclusão das negociações no âmbito da Agenda de Desenvolvimento de Doha",
            indicators = listOf(
                Indicator(title = "17.10.1", description = "Média ponderada das tarifas aduaneiras à escala mundial")
            )
        ),
        Meta(
            id = 161,
            title = "Meta 17.11",
            description = "Aumentar significativamente as exportações dos países em desenvolvimento, em particular com o objetivo de duplicar a participação dos países menos desenvolvidos nas exportações globais até 2020",
            indicators = listOf(
                Indicator(title = "17.11.1", description = "Quota-parte das exportações globais proveniente dos países em vias de desenvolvimento e dos países menos desenvolvidos")
            )
        ),
        Meta(
            id = 162,
            title = "Meta 17.12",
            description = "Concretizar a implementação oportuna de acesso a mercados livres de quotas e taxas, de forma duradoura, para todos os países menos desenvolvidos, de acordo com as decisões da OMC, inclusive através de garantias de que as regras de origem preferencial aplicáveis às importações provenientes de países menos desenvolvidos sejam transparentes e simples, e contribuam para facilitar o acesso ao mercado",
            indicators = listOf(
                Indicator(title = "17.12.1", description = "Média ponderada de tarifas aduaneiras aplicadas aos países em desenvolvimento, países menos desenvolvidos e pequenos Estados insulares em desenvolvimento")
            )
        ),
        Meta(
            id = 163,
            title = "Meta 17.13",
            description = "Aumentar a estabilidade macroeconómica global, inclusive através da coordenação e da coerência de políticas",
            indicators = listOf(
                Indicator(title = "17.13.1", description = "Painel de indicadores macroeconómicos")
            )
        ),
        Meta(
            id = 164,
            title = "Meta 17.14",
            description = "Aumentar a coerência das políticas para o desenvolvimento sustentável",
            indicators = listOf(
                Indicator(title = "17.14.1", description = "Número de países com mecanismos em vigor para reforçar a coerência política do desenvolvimento sustentável")
            )
        ),
        Meta(
            id = 165,
            title = "Meta 17.15",
            description = "Respeitar o espaço político e a liderança de cada país para estabelecer e implementar políticas para a erradicação da pobreza e o desenvolvimento sustentável",
            indicators = listOf(
                Indicator(title = "17.15.1", description = "Extensão do recurso a quadros de resultados e instrumentos de planeamento delineados pelos beneficiários (country ownership), por parte dos países fornecedores de cooperação para o desenvolvimento")
            )
        ),
        Meta(
            id = 166,
            title = "Meta 17.16",
            description = "Reforçar a parceria global para o desenvolvimento sustentável, complementada por parcerias multissetoriais que mobilizem e partilhem o conhecimento, a perícia, a tecnologia e os recursos financeiros, para apoiar a realização dos objetivos do desenvolvimento sustentável em todos os países, particularmente nos países em desenvolvimento",
            indicators = listOf(
                Indicator(title = "17.16.1", description = "Número de países que reportam progressos na eficácia dos quadros de monitorização de múltiplos atores que apoiam o cumprimento dos Objetivos de Desenvolvimento Sustentável")
            )
        ),
        Meta(
            id = 167,
            title = "Meta 17.17",
            description = "Incentivar e promover parcerias públicas, público-privadas e com a sociedade civil que sejam eficazes, a partir da experiência das estratégias de mobilização de recursos dessas parcerias",
            indicators = listOf(
                Indicator(title = "17.17.1", description = "Montante de dólares dos Estados Unidos destinados a parcerias público-privadas para infraestruturas")
            )
        ),
        Meta(
            id = 168,
            title = "Meta 17.18",
            description = "Até 2020, reforçar o apoio à capacitação para os países em desenvolvimento, inclusive para os países menos desenvolvidos e pequenos Estados insulares em desenvolvimento, para aumentar significativamente a disponibilidade de dados de alta qualidade, atuais e fidedignos, desagregados ao nível do rendimento, género, idade, etnia, estatuto migratório, incapacidade, localização geográfica e outras características relevantes em contextos nacionais",
            indicators = listOf(
                Indicator(title = "17.18.1", description = "Indicador de capacidade estatística para monitorização dos ODS"),
                Indicator(title = "17.18.2", description = "Número de países que possuem legislação estatística nacional que cumpre os Princípios Fundamentais das Estatísticas Oficiais"),
                Indicator(title = "17.18.3", description = "Número de países com um plano estatístico nacional totalmente financiado e em execução, por fonte de financiamento")
            )
        ),
        Meta(
            id = 169,
            title = "Meta 17.19",
            description = "Até 2030, partir de iniciativas existentes para desenvolver medidas do progresso do desenvolvimento sustentável que complementem o Produto Interno Bruto (PIB) e apoiem a capacitação estatística nos países em desenvolvimento",
            indicators = listOf(
                Indicator(title = "17.19.1", description = "Valor em dólares de todos os recursos disponibilizados para fortalecer a capacidade estatística nos países em desenvolvimento"),
                Indicator(title = "17.19.2", description = "Proporção de países que a) realizaram pelo menos um Recenseamento da População e da Habitação nos últimos 10 anos; e b) atingiram 100% de registos de nascimento e 80% de registos de óbitos")
            )
        )
    )

    return listOf(
        Objective(
            id = 1,
            title = "Objetivo 1",
            description = "Erradicar a pobreza em todas as suas formas, em todos os lugares",
            details = "Erradicar a pobreza em todas as suas formas. Erradicar a pobreza extrema para todas as pessoas em todos os lugares. Reduzir pelo menos pela metade a proporção de homens, mulheres e crianças de todas as idades que vivem na pobreza. Implementar sistemas e medidas de proteção social nacionalmente apropriados para todos. Garantir que todos têm direitos iguais aos recursos económicos e acesso a serviços básicos.",
            color = colors[0],
            metas = objective1Metas.map { it.copy(objectiveId = 1) }
        ),
        Objective(
            id = 2,
            title = "Objetivo 2",
            description = "Erradicar a fome, alcançar a segurança alimentar, melhorar a nutrição e promover a agricultura sustentável",
            details = "Erradicar a fome em todo o mundo. Garantir o acesso de todas as pessoas a alimentos seguros, nutritivos e suficientes durante todo o ano. Acabar com todas as formas de desnutrição. Garantir sistemas sustentáveis ​​de produção de alimentos. Implementar práticas agrícolas resilientes que aumentem a produtividade e a produção e que ajudem a manter os ecossistemas.",
            color = colors[1],
            metas = objective2Metas.map { it.copy(objectiveId = 2) }
        ),
        Objective(
            id = 3,
            title = "Objetivo 3",
            description = "Garantir o acesso à saúde de qualidade e promover o bem-estar para todos, em todas as idades",
            details = "Garantir saúde e bem-estar para todos. Reduzir a taxa de mortalidade global. Acabar com as mortes evitáveis de recém-nascidos e crianças menores de 5 anos. Erradicar as epidemias de HIV, tuberculose, malária e doenças tropicais negligenciadas. Promover a saúde mental e o bem-estar. Alcançar a cobertura universal de saúde.",
            color = colors[2],
            metas = objective3Metas.map { it.copy(objectiveId = 3) }
        ),
        Objective(
            id = 4,
            title = "Objetivo 4",
            description = "Garantir o acesso à educação inclusiva, de qualidade e equitativa, e promover oportunidades de aprendizagem ao longo da vida para todos",
            details = "Garantir uma educação inclusiva e de qualidade para todos. Promover a aprendizagem ao longo da vida. Eliminar as disparidades de género na educação. Garantir que todas as meninas e meninos tenham acesso a cuidados e desenvolvimento de qualidade na primeira infância. Garantir a igualdade de acesso a todos os níveis de educação para os mais vulneráveis, incluindo pessoas com deficiência, povos indígenas e crianças em situação de vulnerabilidade.",
            color = colors[3],
            metas = objective4Metas.map { it.copy(objectiveId = 4) }
        ),
        Objective(
            id = 5,
            title = "Objetivo 5",
            description = "Alcançar a igualdade de género e empoderar todas as mulheres e raparigas",
            details = "Acabar com todas as formas de discriminação contra todas as mulheres e meninas em todos os lugares. Eliminar todas as formas de violência contra todas as mulheres e meninas nas esferas pública e privada, incluindo tráfico, exploração sexual e outros tipos. Garantir a participação plena e efetiva das mulheres e a igualdade de oportunidades de liderança.",
            color = colors[4],
            metas = objective5Metas.map { it.copy(objectiveId = 5) }
        ),
        Objective(
            id = 6,
            title = "Objetivo 6",
            description = "Garantir a disponibilidade e a gestão sustentável da água potável e do saneamento para todos",
            details = "Alcançar o acesso universal à água potável segura e acessível para todos. Alcançar o acesso a saneamento e higiene adequados para todos. Melhorar a qualidade da água reduzindo a poluição, eliminando o despejo de produtos químicos e materiais perigosos.",
            color = colors[5],
            metas = objective6Metas.map { it.copy(objectiveId = 6) }
        ),
        Objective(
            id = 7,
            title = "Objetivo 7",
            description = "Garantir o acesso a fontes de energia fiáveis, sustentáveis e modernas para todos",
            details = "Garantir o acesso universal a energia renovável e acessível para todos. Aumentar a participação das energias renováveis no mix global de energia. Reforçar a cooperação internacional para facilitar o acesso à pesquisa e tecnologia de energia limpa. Expandir a infraestrutura e atualizar a tecnologia para fornecer serviços de energia modernos e sustentáveis para todos nos países em desenvolvimento.",
            color = colors[6],
            metas = objective7Metas.map { it.copy(objectiveId = 7) }
        ),
        Objective(
            id = 8,
            title = "Objetivo 8",
            description = "Promover o crescimento económico inclusivo e sustentável, o emprego pleno e produtivo e o trabalho digno para todos",
            details = "Garantir o desenvolvimento económico inclusivo e sustentável em todo o mundo. Alcançar níveis mais altos de produtividade económica por meio da diversificação, atualização tecnológica e inovação. Alcançar emprego pleno e produtivo e trabalho decente para todos, inclusive para jovens e pessoas com deficiência. Alcançar salário igual para trabalho de igual valor.",
            metas = objective8Metas.map { it.copy(objectiveId = 8) },
            color = colors[7]
        ),
        Objective(
            id = 9,
            title = "Objetivo 9",
            description = "Construir infraestruturas resilientes, promover a industrialização inclusiva e sustentável e fomentar a inovação",
            details = "Garantir a inovação e infraestruturas sustentáveis da indústria. Desenvolver infraestrutura confiável, sustentável e resiliente que apoie o desenvolvimento económico e o bem-estar humano. Promover a industrialização inclusiva e sustentável. Atualizar as infraestruturas e modernizar as indústrias para torná-las sustentáveis. Apoiar uma maior adoção de tecnologias renováveis.",
            metas = objective9Metas.map { it.copy(objectiveId = 9) },
            color = colors[8]
        ),
        Objective(
            id = 10,
            title = "Objetivo 10",
            description = "Reduzir as desigualdades no interior dos países e entre países",
            details = "Capacitar e promover a inclusão social, económica e política de todos, independentemente de idade, sexo, deficiência, raça, etnia, origem, religião ou condição econômica ou outra. Garanta a igualdade de oportunidades. Reduzir as desigualdades de resultado, eliminando leis, políticas e práticas discriminatórias.",
            metas = objective10Metas.map { it.copy(objectiveId = 10) },
            color = colors[9]
        ),
        Objective(
            id = 11,
            title = "Objetivo 11",
            description = "Tornar as cidades e comunidades inclusivas, seguras, resilientes e sustentáveis",
            details = "Construir cidades e sociedades sustentáveis em todo o mundo. Garantir o acesso de todos a uma habitação adequada, segura e acessível. Aumentar a capacidade de planeamento e gestão integrados e sustentáveis de aglomerados humanos. Reduzir o impacto ambiental adverso das cidades, prestando atenção especial à qualidade do ar e à gestão de resíduos.",
            metas = objective11Metas.map { it.copy(objectiveId = 11) },
            color = colors[10]
        ),
        Objective(
            id = 12,
            title = "Objetivo 12",
            description = "Garantir padrões de consumo e de produção sustentáveis",
            details = "Reduzir o desperdício global de alimentos na produção e consumidor. Alcançar a gestão ambientalmente saudável de produtos químicos ao longo de seu ciclo de vida. Reduzir substancialmente a geração de resíduos por meio da prevenção, redução, reciclagem e reutilização.",
            metas = objective12Metas.map { it.copy(objectiveId = 12) },
            color = colors[11]
        ),
        Objective(
            id = 13,
            title = "Objetivo 13",
            description = "Adotar medidas urgentes para combater as alterações climáticas e os seus impactos",
            details = "Tomar medidas urgentes para combater as mudanças climáticas e seus impactos. Fortalecer a resiliência e a capacidade de adaptação aos perigos e desastres naturais relacionados ao clima. Integrar soluções e medidas de mudança climática nas políticas, estratégias e planejamento nacionais. Melhorar a educação sobre mitigação das mudanças climáticas, redução de impacto e alerta precoce.",
            metas = objective13Metas.map { it.copy(objectiveId = 13) },
            color = colors[12]
        ),
        Objective(
            id = 14,
            title = "Objetivo 14",
            description = "Conservar e usar de forma sustentável os oceanos, mares e os recursos marinhos para o desenvolvimento sustentável",
            details = "Conservar e usar de forma sustentável os oceanos, mares e recursos marinhos. Prevenir e diminuir a poluição marinha de todos os tipos, em particular de atividades terrestres. Gerir e proteger de forma sustentável os ecossistemas marinhos e costeiros para evitar impactos adversos significativos. Acabar com a sobrepesca, práticas de pesca ilegais, não declaradas e destrutivas.",
            metas = objective14Metas.map { it.copy(objectiveId = 14) },
            color = colors[13]
        ),
        Objective(
            id = 15,
            title = "Objetivo 15",
            description = "Proteger, restaurar e promover o uso sustentável dos ecossistemas terrestres, gerir de forma sustentável as florestas, combater a desertificação, travar e reverter a degradação dos solos e travar a perda de biodiversidade",
            details = "Prevenir ameaças à biodiversidade.Garantir a conservação, restauração e uso sustentável dos ecossistemas terrestres e de água doce, incluindo florestas, pântanos, montanhas e terras secas.Promover a implementação da gestão sustentável de todos os tipos de florestas.Deter o desmatamento.Combater a desertificação e restaurar terras e solos degradados.",
            metas = objective15Metas.map { it.copy(objectiveId = 15) },
            color = colors[14]
        ),
        Objective(
            id = 16,
            title = "Objetivo 16",
            description = "Promover sociedades pacíficas e inclusivas para o desenvolvimento sustentável, proporcionar o acesso à justiça para todos e construir instituições eficazes, responsáveis e inclusivas a todos os níveis",
            details = "Promover sociedades justas, pacíficas e inclusivas.Reduzir significativamente todas as formas de violência.Erradicar o abuso, a exploração e o tráfico e todas as formas de violência e tortura de crianças.Promover o estado de direito nos níveis nacional e internacional.Garantir a igualdade de acesso à justiça para todos.",
            metas = objective16Metas.map { it.copy(objectiveId = 16) },
            color = colors[15]
        ),
        Objective(
            id = 17,
            title = "Objetivo 17",
            description = "Reforçar os meios de implementação e revitalizar a Parceria Global para o Desenvolvimento Sustentável",
            details = "Revitalizar a parceria global para o desenvolvimento sustentável.Apoiar a criação de fortes parcerias ODS para atingir as metas ambiciosas da Agenda 2030.Reúna os governos nacionais, a comunidade internacional, a sociedade civil, o setor privado e outros atores.",
            metas = objective17Metas.map { it.copy(objectiveId = 17) },
            color = colors[16]
        )

    )
}