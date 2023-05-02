def cadastrar_usuario():
    nome = str(input("Digite seu nome:"))
    sobrenome = str(input("Digite seu sobrenome:"))
    idade = int(input("Digite sua idade:"))
    email = str(input("Digite seu e-mail:"))
    telefone = str(input("Digite seu telefone:"))
    endereco = str(input("Digite seu endereco:"))


usuario = {
    'Nome':nome,
    'Sobrenome': sobrenome,
    'idade': idade,
    'email': email,
    'telefone': telefone,
    'endereco': endereco
}


print(cadastrar_usuario())
