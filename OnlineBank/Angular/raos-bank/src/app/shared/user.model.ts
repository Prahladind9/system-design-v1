export class user {
    constructor(
        public firstName: string,
        public lastName: string,
        public phone: string,
        public email: string,
        public userName: string,
        public password: string,
        public primaryAccount: {
            primaryAccountId: number,
            accountNumber: number,
            accountBalance: number
        },
        public savingsAccount: {
            savingsAccountId: number,
            accountNumber: number,
            accountBalance: number
        }
    ) { }
}  