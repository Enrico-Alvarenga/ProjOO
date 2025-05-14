from abc import ABC, abstractmethod

# 1. Abstração - Interface
class Notificacao(ABC):
    @abstractmethod
    def enviar(self, mensagem: str) -> None:
        pass

# 2. Implementações concretas - Polimorfismo
class EmailNotificacao(Notificacao):
    def enviar(self, mensagem: str) -> None:
        print(f"[Email] Enviando mensagem: {mensagem}")

class SMSNotificacao(Notificacao):
    def enviar(self, mensagem: str) -> None:
        print(f"[SMS] Enviando mensagem: {mensagem}")

class PushNotificacao(Notificacao):
    def enviar(self, mensagem: str) -> None:
        print(f"[Push] Enviando mensagem: {mensagem}")

# 3. Fábrica - Encapsulamento e Flexibilidade
class NotificacaoFactory:
    @staticmethod
    def criar_notificacao(tipo: str) -> Notificacao:
        if tipo == "email":
            return EmailNotificacao()
        elif tipo == "sms":
            return SMSNotificacao()
        elif tipo == "push":
            return PushNotificacao()
        else:
            raise ValueError("Tipo de notificação inválido")

# 4. Exemplo de uso - Cliente
def main():
    tipos = ["email", "sms", "push"] 

    for tipo in tipos:
        try:
            notificacao = NotificacaoFactory.criar_notificacao(tipo)
            notificacao.enviar("Olá! Esta é sua notificação.")
        except ValueError as e:
            print(f"[Erro] {e}")

if __name__ == "__main__":
    main()
